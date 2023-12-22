package com.marolix.session.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMethodDemo {
	public static void main(String[] args) throws Exception {
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(-8, 1, 7));
		// asecnding sort -8,1,7
		// descing order sort 7,1,-8
		Optional<Integer> opt = l.stream().max((x, y) -> x.compareTo(y));
//		System.out.println(opt.isPresent());
//		int b = opt.orElseGet(() -> 1000);
//		opt.orElseThrow(() -> new Exception("as no data avaialable throwing exception"));
//		System.out.println("line 15 " + b);
		if (opt.isPresent())
			System.out.println("opianal value is " + opt.get());

	}

}
