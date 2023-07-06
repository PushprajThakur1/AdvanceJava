package com.rays.bean;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;


public class EmployeModel {

	public  void Add(EmployeBean Bean) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		
		PreparedStatement ps = conn.prepareStatement("Insert into Employe values (1,'Kreet',2000)");
		
		int i = ps.executeUpdate();
		
   System.out.println("Data Inserted " +i);		
	}

	public List search () throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");		
		PreparedStatement ps = conn.prepareStatement("select * from employe");		
				ResultSet rs = ps.executeQuery();
		ArrayList list = new ArrayList();
		
		
		while(rs.next()) {
			EmployeBean Bean = new EmployeBean();
			Bean.setId(rs.getInt(1));
			Bean.setName(rs.getString(2));
			Bean.setSalary(rs.getInt(3));
			
			list.add(Bean);
			}
		return list;
		}
	
	public Integer pknext() throws Exception {
		int pk=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("select max(id)from employe");
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			pk = rs.getInt(5);
		}
				

		return pk+1;
		
		
	}
	
	public EmployeBean findById(int id ) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance","root","root");
		PreparedStatement ps = conn.prepareStatement("select * from employe where id = ?");
		ps.setInt(1, id);
	    ResultSet rs = ps.executeQuery();
	    EmployeBean bean = null;
	    
		return bean;
	}
}
