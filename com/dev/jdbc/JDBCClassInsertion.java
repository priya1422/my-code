package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class JDBCClassInsertion {

	public static void main(String[] args) {
		Connection conn=null;//interface
		PreparedStatement pstmt=null;//interface
		
		//load the driver by creating obj reference of driver class and storing in driver interface
		try {
			Driver div=new Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver loaded...");
			//Get the connection Via driver
			String url="jdbc:mysql://localhost:3306"+"/caps_buggers?user=root&password=root";
			conn=DriverManager.getConnection(url);
			System.out.println("conn estd...");
			//issue the query via connection
			String query="INSERT INTO users_info values(?,?,?,?)";
		pstmt=(PreparedStatement) conn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the userid:... ");
			int userid=Integer.parseInt(sc.nextLine());
			System.out.println("enter the username:...");
			String username=sc.nextLine();
			System.out.println("enter the email");
			String email=sc.nextLine();
			System.out.println("enter the password");
			String password=sc.nextLine();
			pstmt.setInt(1, userid);
			pstmt.setString(2, username);
			pstmt.setString(3, email);
			pstmt.setString(4, password);
			int count=pstmt.executeUpdate();
			//process the results..
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
