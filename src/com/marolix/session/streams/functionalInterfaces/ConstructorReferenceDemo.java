package com.marolix.session.streams.functionalInterfaces;

class Bike {
	public Bike() {
		System.out.println("paramater less constructor called");
	}

	public Bike(int a, String b) {
		// this.getClass().getName();
		System.out.println("constructor called in Bike");
	}
}

@FunctionalInterface
interface ConstructorReference {
	public void m1(int a, String b);
}

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		Bike b = new Bike();
		ConstructorReference cr = Bike::new;
		cr.m1(0, null);
	}

}
