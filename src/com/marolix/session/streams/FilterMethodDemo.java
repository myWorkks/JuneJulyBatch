package com.marolix.session.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterMethodDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(4);
		list.add(9);
		System.out.println(list + "in line 18");
		Stream<Integer> s = list.stream();
		// Predicate<Integer> p = t -> t % 2 == 0;
		s = s.filter(t -> {
			System.out.println("filter method called for nuber " + t);
			return t % 2 == 0;
		});
		// s.close();
		s.forEach((t) -> {
			System.out.println("in foreach for number " + t);
		});

		s.forEach((t) -> System.out.println(t));
		System.out.println(list + "in line 25");
	}

}
