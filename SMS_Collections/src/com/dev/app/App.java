package com.dev.app;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.dev.Services.StudentService;
import com.dev.Services.StudentServiceImpl;
import com.dev.beans.Student;
import com.dev.exceptions.*;

public class App {

	static Scanner scn = new Scanner(System.in);
	
	static Student createStudent() {
		Student student = new Student();
		System.out.println("Enter id:");
		student.setId(Integer.parseInt(scn.nextLine()));
		System.out.println("Enter name:");
		student.setName(scn.nextLine());
		System.out.println("Enter email:");
		student.setEmail(scn.nextLine());
		System.out.println("Enter password:");
		student.setPassword(scn.nextLine());
		System.out.println(student);
		return student;
		
	}
	public static void main(String[] args) {
		StudentService stud = new StudentServiceImpl();
		Student s1;
		Integer id;

		outer: while (true) {
			System.out.println("1.Create new Profile of student:");
			System.out.println("2.Search for a student data:");
			System.out.println("3.Update Email Of the Student:");
			System.out.println("4.Delete the data of the student:");
			System.out.println("5.Display all the student details:");
			System.out.println("6.Student login");
			System.out.println("Enter Option u want to select:");
			
			switch (Integer.parseInt(scn.nextLine())) {
			case 1:
				
				s1=createStudent();
				boolean state = stud.CreateProfileService(s1);
				if (state) {
					System.out.println("Successfuly created the profile");
				} else {
					throw new ProfilenotCreatedException();
				}
				break;
			case 2:
				System.out.println("Enter id of student:");
				s1 = stud.SearchStudentService(Integer.parseInt(scn.nextLine()));
				if (s1 != null)
					System.out.println(s1);
				else
					throw new SearchnotFoundException();
				break;
			case 3:
				System.out.println("Enter id of student:");
				id = Integer.parseInt(scn.nextLine());
				System.out.println("Enter new email for student:");
				String email = scn.nextLine();
				System.out.println("Enter password of student:");
				String password = scn.nextLine();
				Boolean s2=stud.UpdateEmailService(id, email, password);
if(s2) {
					System.out.println("Student email updated successfully.");
}
				else
					throw new EmailnotUpdatedException();
				break;
			case 4:
				System.out.println("Enter id of student:");
				id = Integer.parseInt(scn.nextLine());
				s1 = stud.DeleteStudentService(id);
				if (s1 != null)
					System.out.println(s1);
				else
					throw new DeleteStudentException();
				break;
			case 5:
				List<Student> studList = stud.getAllStudentsService();
				Iterator<Student> it = studList.iterator();
				if (it.hasNext()) {
					while (it.hasNext())
						System.out.println(it.next());
				} else {
					throw new StudentDatanotFoundException();
				}
				break;
			case 6:
				System.out.println("Enter id of student:");
				id = Integer.parseInt(scn.nextLine());
				System.out.println("Enter password of student:");
				String password1 = scn.nextLine();
				s1=stud.LoginServices(id, password1);
				if(stud.LoginServices(id, password1)!=null)
				{
					System.out.println(s1);
				}
				else
				{
					throw new LoginnotFoundException();
				}
				
			case 7:
				break outer;
			}
		}
	}
}
