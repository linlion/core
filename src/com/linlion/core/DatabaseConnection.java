package com.linlion.core;

import java.sql.*;

public class DatabaseConnection {
	private Connection con = null;
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String USER = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/linlion";
	private static final String PASS = "root";

	public DatabaseConnection() throws Exception {
		Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USER, PASS);
	}

	public Connection getConnection() throws Exception {
		return con;
	}

	public void close() throws Exception {
		if (con != null) {
			con.close();
			System.out.println("bdc closed");
		}
	}

	public void finalize() throws Exception {
		if (con != null) {
			con.close();
			System.out.println("bdc closed");
		}
	}
}