package com.marolix.session.streams.functionalInterfaces;

class Dummy {
	static public void dummy() {
		System.out.println("this is dummy method implementation static");
	}

	public void dummy(int a) {
		System.out.println("this is dummy method implementation instance method");
	}
}

@FunctionalInterface
interface StaticMethodReference {

	void m1();
}

public class StaticMethodReferenceDemo {

	public static void main(String[] args) {

		StaticMethodReference st = Dummy::dummy;
		st.m1();
	}

}
