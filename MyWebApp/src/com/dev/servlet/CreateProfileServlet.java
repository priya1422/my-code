package com.dev.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.beans.Student;

@WebServlet("/signUp")
public class CreateProfileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String studentId = req.getParameter("studentId");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("passwd");
		
		Student student = new Student();
		student.setId(Integer.parseInt(studentId));
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);
		
		System.out.println(student);
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Data Submitted</h1>");
	}
}

