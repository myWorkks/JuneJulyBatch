package com.marolix.session.jdbccrudoperations;

import java.util.List;
import java.util.Scanner;

public class Controller {

	private Service service = new Service();

	public void addStudent() throws Exception {
		System.out.println("Student form");
		System.out.println("please enter all the details");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your father name");
		String fname = sc.next();
		System.out.println("enter your mobile number");
		String mobile = sc.next();
		System.out.println("select class from 1 to 10");
		String grade = sc.next();
		System.out.println("enter y to submit");
		String confiramtion = sc.next();
		// confiramtion.toUpperCase().equals("Y") ? service.addStudent(): throw new
		// Exception("You are not confirmed the credentials");
		if (confiramtion.toUpperCase().equals("Y")) {
			// String fatherName, String name, String grade, String mobileNumber
			StudentModel student = new StudentModel(fname, name, grade, mobile);
			System.out.println(service.addStudent(student));
		} else {
			throw new Exception("You are not confirmed the credentials");
		}
	}

	public void viewAllStudents() {
		List<StudentModel> list = service.readAllStudents();
		System.out.println("student details");
		System.out.println("sno \t|\t name \t|\t father name \t|\t mobile number \t|\t grade \t| ");
		for (StudentModel s : list) {
			System.out.println(s.getSno() + " \t|\t" + s.getName() + " \t|\t" + s.getFatherName() + " \t|\t"
					+ s.getMobileNumber() + "\t|\t " + s.getGrade() + "\t| ");
		}
	}
}
