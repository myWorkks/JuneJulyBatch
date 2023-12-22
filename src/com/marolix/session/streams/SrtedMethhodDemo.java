package com.marolix.session.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SrtedMethhodDemo {

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 100);
		// stream.forEach(t -> System.out.print(t + " "));
		Stream<Integer> str = stream.boxed();
		// compare(t,t)
		Comparator<Integer> comp = (a, b) -> -a.compareTo(b);
		List<Integer> l = str.sorted(comp).collect(Collectors.toList());

		System.out.println(l);
	}

}
