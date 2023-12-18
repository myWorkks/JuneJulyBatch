package com.marolix.session.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {

		// int compare(S1,s1)
		Comparator<String> comp = (String s1, String s2) -> {

			int l1 = s1.length();
			int l2 = s2.length();
			return l1 > l2 ? +96 : (l1 == l2 ? 0 : -12);
		};
		Set<String> strings = new TreeSet<String>(comp);
		// ,Arrays.asList("barath", "abhishek")
		strings.add("barath");
		strings.add("abhishek");
		strings.add("z");
		System.out.println(strings);
	}

}
