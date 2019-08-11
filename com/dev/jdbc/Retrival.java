package com.dev.jdbc;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class Retrival {

	public static void main(String[] args) {
		Connection conn=null;
		java.sql.CallableStatement cstmt=null;
		ResultSet rs=null;
		
			try {
				//load the driver
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("driver loaded......");
				
				//get the connection via driver
				String url="jdbc:mysql://localhost:3306/caps_buggers";
				String path="C:/Users/hai friends/Desktop/db.properties";
				FileReader read=new FileReader(path);
				Properties prop=new Properties(); //jst we can read the file
				prop.load(read);//we need to use the user and pswd
				conn = DriverManager.getConnection(url,prop);
				System.out.println("connection established....");
				
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
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(cstmt!=null)
					{
						try {
							cstmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					if(rs!=null)
					{
						try {
							rs.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					}
				}
				

		}


