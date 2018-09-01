package com.predicate1;

import java.util.function.Predicate;

public class RemoveNullAndEmptyStringFromArrayUsingPredicate {

	public static void main(String[] args) {

		String[] names = { "Lijo", null, "Paul", "", null, "Maxon" };

		Predicate<String> p = s -> s != null && !s.isEmpty();

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
