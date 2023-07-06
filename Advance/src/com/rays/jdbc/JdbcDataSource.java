package com.rays.jdbc;

import java.sql.Connection;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	private ComboPooledDataSource cpds = null;
	private static JdbcDataSource jds = null;

	private JdbcDataSource() {

		try {
			ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");

			cpds = new ComboPooledDataSource();

			cpds.setDriverClass(rb.getString("Driver"));
			cpds.setJdbcUrl(rb.getString("url"));
			cpds.setUser(rb.getString("user"));
			cpds.setPassword(rb.getString("password"));
			cpds.setInitialPoolSize(Integer.parseInt(rb.getString("initial")));
			cpds.setAcquireIncrement(Integer.parseInt(rb.getString("increment")));
			cpds.setMaxPoolSize(Integer.parseInt(rb.getString("max")));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static JdbcDataSource getInstnce() {

		if (jds == null) {
			jds = new JdbcDataSource();
		}
		return jds;

	}

	public static Connection getConnection() {
		try {
			return getInstnce().cpds.getConnection();
		} catch (Exception e) {

			return null;

		}

	}
}
