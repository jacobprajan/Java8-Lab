package com.predicate1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoin {

	public static void main(String[] args) {

		int[] x = { 0, 5, 3, 6, 10, 7, 4 };

		Predicate<Integer> p1 = i -> i > 5;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("No:s greater than 5 : " + m1(p1, x));

		System.out.println("Even no:s are : " + m2(p2, x));
		
		System.out.println("No:s not greater than 5 : " + m1(p1.negate(), x));

		System.out.println("Odd no:s are : " + m2(p2.negate(), x));
	
		System.out.println("No:s greater than 5 and even : " + m1(p1.and(p2), x));
	
		System.out.println("No:s greater than 5 or even : " + m1(p1.or(p2), x));

	}

	private static List<Integer> m1(Predicate<Integer> p1, int[] x) {

		List<Integer> list = new ArrayList<>();
		for (int i : x) {
			if (p1.test(i)) {
				list.add(i);
			}
		}
		return list;
	}

	private static List<Integer> m2(Predicate<Integer> p2, int[] x) {
		List<Integer> list = new ArrayList<>();
		for (int i : x) {
			if (p2.test(i)) {
				list.add(i);
			}
		}
		return list;
	}

}
