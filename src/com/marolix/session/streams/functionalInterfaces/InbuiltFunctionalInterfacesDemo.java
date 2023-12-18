package com.marolix.session.streams.functionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuiltFunctionalInterfacesDemo {

	public static void main(String[] args) {
		Function<Integer, String> f1 = (i) -> i.toString();
// String apply(Integer)
		String s = f1.apply(1);
		// f1.apply("1");
		System.out.println(s);

		Predicate<String> p = s1 -> s1.length() > 3;

		System.out.println(p.test("bharath"));
		System.out.println(p.test("bha"));

		Consumer<Object> c = t -> {
			System.out.println(t.getClass().getName());
			// return 1;
		};
		c.accept("bharath");

		Supplier<String> sup = () -> {
			return new String("generated string using supplier");
		};
		System.out.println(sup.get());
	}

}
