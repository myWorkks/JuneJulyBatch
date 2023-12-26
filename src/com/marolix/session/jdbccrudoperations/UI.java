package com.marolix.session.jdbccrudoperations;

public class UI {
	private static Controller controller = new Controller();

	public static void add() {
		try {
			controller.addStudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
	}

	public static void read() {
		try {
			controller.viewAllStudents();
			;
		} catch (Exception e) {

			e.printStackTrace();
		}
		;
	}

	public static void main(String[] args) {
		// add();
		read();
	}

}
