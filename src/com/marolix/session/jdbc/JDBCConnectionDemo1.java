package com.marolix.session.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("loading and registering driver class");
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Class c= Class.forName("java.lang.Bike");

		final String url = "jdbc:mysql://localhost:3306/june_july_batch_sessions";
		final String username = "root";

		final String password = args[0];
		System.out.println("establishing the connection");
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println("connection established");

		Statement statement = connection.createStatement();
		// execute==boolean
		// executeUpdate== int //insert,delete and update
		// executeQuery== ResultSet//read

		 String query = " insert into student_details (name,father_name,mobile_number)values(\"ram\",\"surya\",\"7894561230\");";

		//String query = "select * from studet_details;";
		System.out.println(query);
		boolean b = statement.execute(query);
		System.out.println(b);
	}

}
