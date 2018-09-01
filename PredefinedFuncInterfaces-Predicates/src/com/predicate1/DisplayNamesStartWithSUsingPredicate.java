package com.predicate1;

import java.util.function.Predicate;

public class DisplayNamesStartWithSUsingPredicate {

	public static void main(String[] args) {

		String[] names = { "Paul", "Sunny", "Lijo", "Maxon", "Sijo" };
		//Predicate<String> p = s -> String.valueOf(s.charAt(0)).equalsIgnoreCase("S");
		// Or
		Predicate<String> p = s -> s.charAt(0) == 'S';

		
		m1(names, p);
	}

	private static void m1(String[] names, Predicate<String> p) {
		for (String s : names) {
			if (p.test(s)) {
				System.out.println(s);
			}
		}
	}

}
