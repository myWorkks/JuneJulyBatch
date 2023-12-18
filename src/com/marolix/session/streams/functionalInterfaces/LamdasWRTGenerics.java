package com.marolix.session.streams.functionalInterfaces;

interface FI3<T> {
	void generic(T t);
}

public class LamdasWRTGenerics {

	public static void main(String[] args) {
		FI3<String> f = (String s) -> {
			System.out.println("example of lamdas with generic");
		};
f.generic("");
	}

}
