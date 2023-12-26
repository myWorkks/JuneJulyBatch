package com.marolix.session.jdbccrudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Repository {
	private static Connection connection = null;

	public static void establishConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		final String url = "jdbc:mysql://localhost:3306/june_july_batch_sessions";
		final String password = "root";
		final String username = "root";
		if (connection == null)
			connection = DriverManager.getConnection(url, username, password);
	}

	public int addStudentDetails(StudentModel student) {
		try {
			establishConnection();
			String insertQuery = "insert into student_details(name,father_name,mobile_number,grade) values(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			ps.setString(1, student.getName());
			ps.setString(2, student.getFatherName());
			ps.setString(3, student.getMobileNumber());
			ps.setString(4, student.getGrade());
			int value = ps.executeUpdate();
			return value;

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
			return 0;
		} finally {
			try {
				if (connection != null && !connection.isClosed()) {
					try {
						connection.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public List<StudentModel> viewAllStudents() {
		List<StudentModel> al = new ArrayList<StudentModel>();
		try {
			establishConnection();

			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from student_details;");
			while (rs.next()) {
				StudentModel s = new StudentModel();
				s.setSno(rs.getLong(1));
				s.setName(rs.getString(2));
				s.setFatherName(rs.getString(3));
				s.setGrade(rs.getString("grade"));
				s.setMobileNumber(rs.getString("mobile_number"));
				al.add(s);
			}
		} catch (SQLException e) {

			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return al;
	}
}
