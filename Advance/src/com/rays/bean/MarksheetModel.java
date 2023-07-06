package com.rays.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MarksheetModel {
	
	public void add (MarksheetBean bn) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
	PreparedStatement ps = conn.prepareStatement("Insert into Marksheet values(?,?,? )");
	
	ps.setInt(1,bn.getRollno());
	ps.setString(2,bn.getName());
	ps.setInt(3, bn.getMarks());
	
	int i = ps.executeUpdate();
	
	System.out.println("Data Insetred" + i);
	
	}
	
	public void testupdate (MarksheetBean bn ) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("Update Marksheet set name = ? , marks  = ? where Rollno = ?");
		
		ps.setString(1, bn.getName());
		ps.setInt(2, bn.getMarks());
		ps.setInt(3,bn.getRollno());
		
		int i = ps.executeUpdate();
		
		System.out.println("Data update " + i );
		
	}
	
	public void testDelete(MarksheetBean bn ) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("Delete from marksheet where Rollno = ?");
		
		ps.setInt(1, bn.getRollno());
		
		int i = ps.executeUpdate();
		
		System.out.println("Data deleted : " + i);
		
		
	}

}
