package com.dev.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.dev.beans.Student;
import com.dev.repo.Database;

public class RepoImpl implements StudentDAO {

	private static Database repo = new Database();
	@Override
	public Boolean CreateProfile(Student student) {
		repo.map.put(student.getId(), student);
		if(repo.map.containsKey(student.getId()))
			return true;
		else
			return false;
	}



	
	@Override
	public Student SearchStudent(Integer id) {
		return repo.map.get(id);
	}

	@Override
	public Boolean UpdateEmail(Integer id, String email, String password) {
		Student s = (Student)repo.map.get(id);
		if (s != null) {
			if (s.getPassword().equals(password)) {
				s.setEmail(email);
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public Student DeleteStudent(Integer id) {
		return repo.map.remove(id);
		
	}

	@Override
	public List<Student> getAllStudents() {
		Collection<Student> students=repo.map.values();
		ArrayList<Student> stud=new ArrayList<Student>(students);
		return stud;
	}




	@Override
	public  Student Login(Integer id, String password)
	{
		Student s = (Student)repo.map.get(id);
		if (s != null) {
			if (s.getPassword().equals(password)) {
				
				return s;
			}
			return null;
		}
		return null;
	}
}
	
