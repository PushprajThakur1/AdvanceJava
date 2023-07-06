package com.rays.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_CRUD {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance" , "root", "root");
	
	Statement stmt = conn.createStatement();
	
	int i = stmt.executeUpdate("delete from employe where id = 2");
	
	System.out.println("Data deleted : " + i );
		
	}

}
