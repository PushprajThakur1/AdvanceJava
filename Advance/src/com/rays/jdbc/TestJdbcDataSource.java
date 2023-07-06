package com.rays.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJdbcDataSource {

	public static void main(String[] args) throws Exception {

		for (int i = 1; i <= 25; i++) {
			System.out.println("COnnection :" + i);
			testDCP();
			System.out.println("=====================================");
		}
	}

	private static void testDCP() throws Exception {

		Connection conn = JdbcDataSource.getConnection();

		PreparedStatement stmt = conn.prepareStatement("select * from Employe");

		ResultSet rs = stmt.executeQuery();

		System.out.println("ID" + "\t" + "Name" + "\t" + "Salary");

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.println("\t" + rs.getInt(3));

		}

	}

}
