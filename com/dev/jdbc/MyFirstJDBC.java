package com.dev.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//load the driver.....
			Driver div=new com.mysql.jdbc.Driver();//creating the object of driver class and storing in the driver interface
			DriverManager.registerDriver(div);
			System.out.println("Driver loaded......");
			
			//get the connection via driver
			String url ="jdbc:mysql://localhost:3306/caps_buggers?user=root&password=root"; 
			conn =DriverManager.getConnection(url);
			System.out.println("connection established....");
			
			//issue sql queries via connection
			String query="select * from users_info";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("query is Issued amd Exeucted");
			System.out.println("********************************");
			//process the results;i
			while(rs.next())
			{
				System.out.println("user id: "+rs.getInt(1));
				System.out.println("User name: "+rs.getString("username"));
				System.out.println("email: "+rs.getString("email"));
				//System.out.println("password: "+rs.getString(4));
				System.out.println("***********************");
			}
			
		} catch (SQLException e) {
			
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
			if(stmt!=null)
			{
				try {
					stmt.close();
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
