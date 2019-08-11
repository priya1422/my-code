package com.dev.jdbc;

import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.CallableStatement;

public class CallableExamples {
public static void main(String[] args) {
	Connection conn =null;
	java.sql.CallableStatement cstmt=null;
	ResultSet rs=null;
	
	try {
		//load the driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//get the connction via driver
		String url="jdbc:mysql://localhost:3306/caps_buggers";
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the username");
		String user=scn.nextLine();
		System.out.println("enter the password");
		String password=scn.nextLine();
		 conn = DriverManager.getConnection(url,user,password);
		 System.out.println("CONNECTION ESTABLISHED.....");
		 
		 //issue sql query
		 String query="call getAllDetails";
		cstmt = conn.prepareCall(query);
		boolean b=cstmt.execute();//we dont know which type of result is it so we use execute()
		cstmt.getResultSet();
		//process the results
		if(b)
		{
			rs=cstmt.getResultSet();
			while(rs.next())
			{
				System.out.println("user id: "+rs.getInt(1));
				System.out.println("User name: "+rs.getString(2));
				System.out.println("email: "+rs.getString(3));
			  //System.out.println("password: "+rs.getString(4));
				System.out.println("*******************************");
		}
		}
		else
		{
			int count=cstmt.getUpdateCount();
			System.out.println("Query ok"+count+"Rows affected...");
		}
			
	}
		 
		 
		
	catch (Exception e) {
		
		e.printStackTrace();
	}
//closing the JDBC Objects
		finally
		{
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(cstmt!=null)
			{
				try {
					cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		

}

}

