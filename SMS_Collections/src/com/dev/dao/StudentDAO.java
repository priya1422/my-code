package com.dev.dao;

import java.util.List;

import com.dev.beans.Student ;

public interface StudentDAO{
Boolean CreateProfile(Student student);
Student SearchStudent(Integer id);
Boolean UpdateEmail(Integer id, String email, String password);
Student DeleteStudent(Integer id);
List<Student>getAllStudents() ;
Student Login(Integer id, String password);
}
