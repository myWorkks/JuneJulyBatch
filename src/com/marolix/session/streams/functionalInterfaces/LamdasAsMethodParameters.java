package com.marolix.session.streams.functionalInterfaces;

class Employee {
	
}

@FunctionalInterface
interface Animal {

	public void makeSound();
}

public class LamdasAsMethodParameters {
	public void m1(String s) {
		System.out.println(s);
	}

	public void m1(Employee e) {
		System.out.println("m1 with eployee as parameter called");
	}

	public void m1(Animal a) {
		System.out.println("this is m1 with animal reference as paramaeter");
	}

	public static void main(String[] args) {
		String s = "";
		String s1 = new String();
		String s2 = new String(s);
		// CharSequence cs= new String();
		byte[] b = { 1, 2, 3, 4, 5, 6, 7 };
		String s3 = new String(b);
		char[] ch = { 'a', '1', 'k' };
		String s4 = new String(ch);
		LamdasAsMethodParameters l = new LamdasAsMethodParameters();
		l.m1(s);
		l.m1(s1);
		l.m1(s2);
		l.m1(s3);
		l.m1(s4);
		Employee e = new Employee();
		l.m1(e);
		l.m1(new Employee());
		Animal a = new Animal() {

			@Override
			public void makeSound() {
				System.out.println("anonymous sound");

			}
		};
		l.m1(a);
		Animal a1 = () -> System.out.println("anonymous sound with lamda");
		l.m1(a1);
		l.m1(() -> {
			System.out.println("anonymous sound with lamda");
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
			;
		});

	}

}
