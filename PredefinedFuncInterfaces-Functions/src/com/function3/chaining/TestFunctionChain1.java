package com.function3.chaining;

import java.util.function.Function;

public class TestFunctionChain1 {
	
	public static void main(String[] args) {
		
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 10);
		
		System.out.println(f1.apply("Varghese Mathew"));
		System.out.println(f2.apply("Varghese Mathew"));
		
		System.out.println(f1.andThen(f2).apply("Varghese Mathew")); // First f1 will be applied and then f2
		
		System.out.println(f1.compose(f2).apply("Varghese Mathew")); // First f2 will be applied and then f1
		
		// Order doesn't matter in this example
	}

}
