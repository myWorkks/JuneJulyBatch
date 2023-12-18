package com.marolix.session.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	static class Employee {
		Integer empId;
		List<String> phoneNumbers;
		String name;

		public Employee(Integer empId, List<String> phoneNumbers, String name) {
			super();
			this.empId = empId;
			this.phoneNumbers = phoneNumbers;
			this.name = name;
		}

		public Employee() {

		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", phoneNumbers=" + phoneNumbers + ", name=" + name + "]";
		}

	}

	static List<Employee> getEmployees() {
		List<Employee> e = new ArrayList<FlatMapDemo.Employee>();
		e.add(new Employee(1, Arrays.asList("9063388012", "1234567890"), "bharath"));
		e.add(new Employee(1, Arrays.asList("9553418833", "9876543210"), "sharath"));
		return e;
	}

	public static void main(String[] args) {
		List<Employee> employees = getEmployees();
		System.out.println(employees);
		employees.stream().flatMap((Employee e) -> {
			List<String> phones = e.phoneNumbers;
			return phones.stream();
		}).forEach((String phone) -> System.out.println(phone));
//return List
//retuen stream
	}

}
