package com.rays.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestPrepareDyanmic {
	
	public static void main(String[] args) throws Exception {
		
		testadd(1,"shali",3000);
		}
	
		private static void testadd(int id , String name , int salary) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
			PreparedStatement ps = conn.prepareStatement("Insert into employe values (?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int i = ps.executeUpdate();
			
			System.out.println("Data Inserted : " + i);
			
		
		}
}
