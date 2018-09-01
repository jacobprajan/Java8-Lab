package com.predicate1;

import java.util.function.Predicate;

public class PredicateStringLengthGreaterThanFive {
	
	public static void main(String[] args) {
		
		
		Predicate<String> p = s -> s.length() > 5;
		
		System.out.println(p.test("Hello World"));
		
		System.out.println(p.test("Bye"));
		
	}

}
