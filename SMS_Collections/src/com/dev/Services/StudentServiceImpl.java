package com.dev.Services;

import java.util.List;

import com.dev.beans.Student;
import com.dev.dao.*;

public class StudentServiceImpl  implements StudentService{
	StudentDAO dao=new RepoImpl();

	@Override
	public Boolean CreateProfileService(Student student) {
		
		return dao.CreateProfile(student);
	}

	@Override
	public Student SearchStudentService(Integer id) {
		return dao.SearchStudent(id);
		
	}

	@Override
	public Boolean UpdateEmailService(Integer id, String email, String password) {
		
		return dao.UpdateEmail(id, email, password);
	}

	@Override
	public Student DeleteStudentService(Integer id) {
		
		return dao.DeleteStudent(id);
	}

	@Override
	public List<Student> getAllStudentsService() {
		
		return dao.getAllStudents();
	}

	@Override
	public Student LoginServices(Integer id, String password) {
		
		return dao.Login(id, password);
	}

}
