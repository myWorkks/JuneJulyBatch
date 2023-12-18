package com.marolix.session.streams.functionalInterfaces;

@FunctionalInterface
interface FI2 {
	public int factorial(int a);
}

public class FoctorialFI {

	public static void main(String[] args) {
		FI2 f2 = (int a) -> {
			int factorial = 1;
			for (int i = 2; i <= a; i++) {
				factorial *= i;
			}
			return factorial;
		};
		int a = f2.factorial(5);
		System.out.println(a);
	}

}
