package com.dev.jdbc;

import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;
import java.sql.*;

public class JDBCUpgradation {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs=null;
		java.sql.PreparedStatement pstmt=null;
		
		
		try {
			//load the driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Driver loaded........");
			
			//get the connection via driver
			String url="jdbc:mysql://localhost:3306/caps_buggers";
			Scanner scn=new Scanner(System.in);
			System.out.println("enter the username");
			String user=scn.nextLine();
			System.out.println("enter the password");
			String password=scn.nextLine();
			 conn = DriverManager.getConnection(url,user,password);
			System.out.println("connection established....");
			
			//issue sql queries via connection
			String query="UPDATE users_info SET email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter the userid...");
			int userid=Integer.parseInt(scn.nextLine());
			System.out.println("enter the new email...");
			String email=scn.nextLine();
			System.out.println("enter the password for upgradation..");
			String password1 = scn.nextLine();
			pstmt.setInt(2,userid);
			pstmt.setString(3,password1);
			pstmt.setString(1,email);
			int count =pstmt.executeUpdate();//process the results..
			if(count>0)
			{
				System.out.println("data inserted...");
			}
			else
			{
				System.out.println("something wrong...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		finally
		{
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}

}

		    
			
	}

