package com.marolix.session.streams;

@FunctionalInterface
public interface FI1 {
//void m1();
	int m1(int a);
}

class A implements FI1 {

	@Override
	public int m1(int a) {
		// TODO Auto-generated method stub
		return 10;
	}
}

class Tester {
	public static void main(String[] args) {
		FI1 f = new A();// using concrete class
		FI1 f1 = new FI1() {

			@Override
			public int m1(int a) {
				// TODO Auto-generated method stub
				return 20;
			}
		};// using anonymous class
		System.out.println("with concrete class " + f.m1(0) + f);
		System.out.println("anonymous class " + f1.m1(0) + f1);

		FI1 f2 = (int a) -> {
			return 30;
		};
		FI1 f3 = (int a) -> 30;
		FI1 f4 = ( a) -> 35;
		FI1 f5 =  a -> 40;
		System.out.println("with lamda expression " + f2.m1(0) + f2);
		System.out.println("with lamda expression " + f3.m1(0) + f3);
		System.out.println("with lamda expression " + f4.m1(0) + f4);
		System.out.println("with lamda expression " + f5.m1(0) + f5);
	}
}