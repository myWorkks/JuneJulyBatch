package com.marolix.session.streams;

import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {
	class Bike implements Comparable<Bike> {
		Double mileage;

		Bike(Double mileage) {
			this.mileage = mileage;
		}

		@Override
		public String toString() {
			return "Bike [mileage=" + mileage + "]";
		}

		@Override
		public int compareTo(Bike o) {

			return this.mileage > o.mileage ? 15 : (this.mileage == o.mileage ? 0 : -7);
		}
	}

	public static void main(String[] args) {

		Set<Integer> s = new TreeSet<Integer>();
		System.out.println("before adding elements " + s);
		s.add(1);
		s.add(200);
		s.add(-20);
		System.out.println("after adding elements " + s);
		Set<Bike> bikeset = new TreeSet<ComparableDemo.Bike>();
		System.out.println("before adding bikes " + bikeset);
		Bike b1 = new ComparableDemo().new Bike(45.0);
		Bike b2 = new ComparableDemo().new Bike(55.0);
		Bike b3 = new ComparableDemo().new Bike(35.0);
		bikeset.add(b1);
		bikeset.add(b2);
		bikeset.add(b3);
		System.out.println("after adding bikes " + bikeset);

	}

}
