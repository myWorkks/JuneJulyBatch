package com.marolix.session.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapMethodDemo {

	private static class Employee {
		Integer empId;
		String name;
		Float salaray;
		LocalDate doj;

		public Employee(Integer empId, String name, Float salaray, LocalDate doj) {
			super();
			this.empId = empId;
			this.name = name;
			this.salaray = salaray;
			this.doj = doj;
		}

		public Employee() {

		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", salaray=" + salaray + ", doj=" + doj + "]";
		}

	}

	private static List<Integer> getIntegerVAlues() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.addAll(Arrays.asList(2, 3, 4, 5));
		return list;
	}

	private static List<Employee> getEmployeeList() {
		List<Employee> empList = new ArrayList<MapMethodDemo.Employee>();
		Employee e = new Employee(1, "sharuk khan", 15000f, LocalDate.of(2023, 3, 7));
		empList.add(e);
		empList.add(new Employee(2, "khan", 150200f, LocalDate.of(2020, 12, 7)));
		empList.add(new Employee(3, "vijay", 2000000f, LocalDate.of(2017, 3, 7)));
		empList.add(new Employee(4, "hareesh", 150200f, LocalDate.of(2020, 12, 7)));
		return empList;
	}

	public static void main(String[] args) {
		List<Integer> intValues = getIntegerVAlues();
		System.out.println(intValues);
		List<Integer> modifiedValues = new ArrayList<Integer>();
		intValues.stream().map((Integer i) -> i * i).forEach(i -> modifiedValues.add(i));

		System.out.println(modifiedValues);
		// converting emp to stinrg object

		List<Employee> empList = getEmployeeList();
		System.out.println(empList);
		empList.stream().filter((Employee e) -> e.salaray > 25000f).map((Employee e) -> e.name)
				.forEach(s -> System.out.println(s));
	}

}
