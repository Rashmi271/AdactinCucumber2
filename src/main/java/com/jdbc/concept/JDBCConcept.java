package com.jdbc.concept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConcept {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc.mysql://localhost:3306/test";
		String userName = "root";
		String password = "admin";
		String query = "select * from city";

		// load the driver
		Class.forName("com.mysql.jdbc.Driver");

		// get the connection
		Connection con = DriverManager.getConnection(dbUrl, userName, password);

		// prepare the statement
		Statement stmt = con.createStatement();

		// execute the query statement
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			String string1 = rs.getString(1);
			System.out.println(string1 + "    ");

			String string2 = rs.getString(2);
			System.out.println(string2 + "    ");

		}

	}
}
