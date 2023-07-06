package com.rays.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepare {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root" , "root");
		PreparedStatement ps = conn.prepareStatement("insert into employe values (6,'vidhi' , 4000)");
		
		int i = ps.executeUpdate();
		
		System.out.println("Data Inserted = " + i);
	}

}