package com.yedam.diary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "diary";
		String password = "diary";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("database connection Success.!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
