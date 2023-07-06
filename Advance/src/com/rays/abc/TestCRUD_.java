package com.rays.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestCRUD_ {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Advance","root","root");
		
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("Insert into employe values (6,'Kreet',4000)");
		
		System.out.println("Data inserted = " + i);
		
	}

}
