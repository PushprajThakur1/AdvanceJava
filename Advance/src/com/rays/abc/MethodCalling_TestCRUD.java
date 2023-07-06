package com.rays.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MethodCalling_TestCRUD {
	
	public static void main(String[] args) throws Exception {
		TestSelect();
		TestUpdate();
		TestAdd();

		
		
	}
		private static void TestSelect () throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			Statement stmt = conn.createStatement();
			
			int i = stmt.executeUpdate("Delete from employe where id = 2");
			
			System.out.println("Data deleted : " + i );
			
		}
		
		private static void TestUpdate() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			Statement stmt = conn.createStatement();
			
			int i = stmt.executeUpdate("Update employe set name = 'krish' where id = 6");
			
			System.out.println("Data Update = " + i);
			
		}
		
		private  static void TestAdd() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			Statement stmt = conn.createStatement();
			
			int i = stmt.executeUpdate("Insert into employe  values (7 ,'vidhi', 40000)");
			
			System.out.println("Data Inserted = " + i );
			
			
		}
	}


