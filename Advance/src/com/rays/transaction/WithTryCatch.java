package com.rays.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WithTryCatch {

	public static void main(String[] args) throws Exception {
		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance", "root", "root");

			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();

			int i = stmt.executeUpdate("insert into Employe values (1,'THAKUR',10000)");
			i = stmt.executeUpdate("insert into Employe value (2,'Jai Ho',9000)");
			//i = stmt.executeUpdate("insert into Employe values (10,'har har mahadev ',60000)");

			System.out.println("Data inserted = " + i);

			conn.commit();

		} catch (SQLException e) {

			conn.rollback();
			//System.out.println("Rollback");
			e.printStackTrace();

		}

	}
}
