package com.rays.Metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

public class SelectMetaData {
	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root", "root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from marksheet");
		
	ResultSetMetaData rsmt = rs.getMetaData();
	
	System.out.println("Catalog Name : " +rsmt.getCatalogName(1));
	System.out.println("Table Name :" +rsmt.getTableName(1));
	
	
	int coloumcount = rsmt.getColumnCount();
	System.out.println("total Columns : "  + coloumcount);
	
	
	for (int i = 1; i<=coloumcount; i++) {
		
		System.out.println("coloumn : " +(i));
		System.out.println("Label : " +rsmt.getColumnLabel(i));
		System.out.println("Name : " +rsmt.getColumnName(i));
		System.out.println("Type : " +rsmt.getColumnTypeName(i));
		System.out.println("Size : " +rsmt.getColumnDisplaySize(i));
		System.out.println("precision : " +rsmt.getPrecision(i));
		System.out.println();
		
	}
	
		
		
	}
	
	

}
