package com.rays.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCRUD {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root" , "root");
		Statement stmt = conn.createStatement();
	int i = stmt.executeUpdate("Update employe set name = 'Roshan' where id = 3");
	System.out.println("Data update = " +1);
		
		
	}

}
