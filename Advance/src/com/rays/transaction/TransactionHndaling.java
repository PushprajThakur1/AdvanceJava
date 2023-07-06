package com.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionHndaling {

	public static void main(String[] args) throws Exception {

		Insert();
	}

	private static void Insert() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

		conn.setAutoCommit(false);

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("Insert into Employe values(112,'thakur',3000)");
		i = stmt.executeUpdate("Insert into Employe values (113,'xyzzz',40000)");
		i = stmt.executeUpdate("Insert into Employe values(114,'abcdef',50000)");

		System.out.println("Data Inserted = " + i);

		conn.commit();

		conn.rollback();

	}

}
