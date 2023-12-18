package com.marolix.session.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 5, 2, 1, 4, 7, 5, 4, 5, 4, 5, 7, 6, 3, 8, 3, 9, 6, 3, 3);
		System.out.println(l);
		l = l.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(l);
		Set<Integer> set = l.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet());
		System.out.println(set);
		double averge = l.stream().collect(Collectors.averagingDouble(t -> t));
		System.out.println(averge);
		// joining
		CharSequence cs = " ";
		CharSequence pre = "statrt";
		CharSequence post = "end";
		// abc pqr
		String s = l.stream().map(i -> i.toString()).collect(Collectors.joining(cs, pre, post));
		System.out.println(s);
	}

}
