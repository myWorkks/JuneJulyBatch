package com.marolix.session.jdbccrudoperations;

import java.util.List;

import javax.management.RuntimeErrorException;

public class Service {
	private Repository repository = new Repository();

	public String addStudent(StudentModel student) {
		int rows = repository.addStudentDetails(student);
		if (rows > 0)
			return "Student registered successfully";
		else {
			return null;
		}
	}

	public List<StudentModel> readAllStudents() {
		List<StudentModel> al = repository.viewAllStudents();
		if (al.isEmpty())
			throw new RuntimeException("no students found");
		else
			return al;
	}
}
