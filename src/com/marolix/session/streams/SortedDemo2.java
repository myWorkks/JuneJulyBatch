package com.marolix.session.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo2 {
	class Student {
		Integer stdRollNo;
		String stdName;
		String stdFatherName;
		LocalDate doj;

		@Override
		public String toString() {
			return "Student [stdRollNo=" + stdRollNo + ", stdName=" + stdName + ", stdFatherName=" + stdFatherName
					+ ", doj=" + doj + "]";
		}

		public Student(Integer stdRollNo, String stdName, String stdFatherName, LocalDate doj) {
			super();
			this.stdRollNo = stdRollNo;
			this.stdName = stdName;
			this.stdFatherName = stdFatherName;
			this.doj = doj;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

	}

	static List<Student> listOfStudents() {

		List<Student> list = new ArrayList<SortedDemo2.Student>();
		SortedDemo2 s = new SortedDemo2();
		// rolno,name,fname,doj
		list.add(s.new Student(1, "vijay", "prasad", LocalDate.of(2021, 8, 23)));
		list.add(s.new Student(2, "ajay", "ramesh", LocalDate.of(2022, 7, 27)));
		list.add(s.new Student(3, "radhika", "raju", LocalDate.of(2023, 9, 12)));
		list.add(s.new Student(4, "prathyu", "shekar", LocalDate.of(2022, 7, 17)));
		return list;
	}

	public static void main(String[] args) {
		List<Student> students = listOfStudents();
		System.out.println(students);
		//sorted()
		//sorted(Comparator c)
		students = students.stream().sorted((Student x, Student y) -> x.doj.compareTo(y.doj)).collect(Collectors.toList());
		System.out.println("students after sorting " + students);
	}

}
