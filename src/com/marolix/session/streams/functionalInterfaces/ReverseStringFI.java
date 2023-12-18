package com.marolix.session.streams.functionalInterfaces;

@FunctionalInterface
interface FI {
	public String reverse(String toRev);
}

public class ReverseStringFI {

	public static void main(String[] args) {

		FI f1 = s -> new StringBuilder(s).reverse().toString();
		
		
		
		String reversed = f1.reverse("bharath");
		System.out.println(reversed);
	}

}
