package com.marolix.session.streams.functionalInterfaces;

@FunctionalInterface
interface InstanecMethodReference {
	public void m1(int a);
}

public class InstanecMethodReferenceDemo {

	public static void main(String[] args) {
		InstanecMethodReference imr = new Dummy()::dummy;
		imr.m1(10);
	}

}
