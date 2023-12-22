package com.marolix.session.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo2 {

	public static void main(String[] args) {

		final String url = "jdbc:mysql://localhost:3306/june_july_batch_sessions";
		final String username = "root";

		final String password = "root";
		Connection connection = null;
		System.out.println("loading and registering driver class");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("establishing the connection");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("connection established");

			Statement statement = connection.createStatement();
			// execute==boolean
			// executeUpdate== int //insert,delete and update
			// executeQuery== ResultSet//read

			String query = " insert into student_details (name,father_name,mobile_number)values(\"ram\",\"surya\",\"7894561230\");";

			// String query = "select * from studet_details;";
			System.out.println(query);
			boolean b = statement.execute(query);
			System.out.println(b);
		} catch (ClassNotFoundException e) {
			System.out.println("please check the driver class name given");
		} catch (SQLException e) {
			System.out.println("something went wrong in server side " + e.getMessage());
		} catch (Exception e) {
			System.out.println("something went wrong");
		} finally {
			try {
				if(connection!=null &&!connection.isClosed())
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

}
