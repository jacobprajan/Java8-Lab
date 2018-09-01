package com.predicate1;

import java.util.function.Predicate;

public class PredicateIsEqual {

	public static void main(String[] args) {
		String[] names = { "Lijo", "Maxon", "Paul" };

		Predicate<String> p = Predicate.isEqual("Maxo");

		check(names, p);
	}

	private static void check(String[] names, Predicate<String> p) {
		for (String name : names) {
			if (p.test(name)) {
				System.out.println("Maxon found");
			} else {
				System.out.println("Maxon not found");
			}
		}

	}

}
