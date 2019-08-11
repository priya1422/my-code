package com.dev.Services;

import java.util.List;

import com.dev.beans.Student;

public interface StudentService {
	Boolean CreateProfileService(Student student);
	Student SearchStudentService(Integer id);
	Boolean UpdateEmailService(Integer id, String email, String password);
	Student DeleteStudentService(Integer id);
	List<Student>getAllStudentsService() ;
	Student LoginServices(Integer id, String password);

}
