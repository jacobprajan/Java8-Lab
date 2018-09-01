package com.function4;

import java.util.function.Function;

public class IdentityFunction {

	
	public static void main(String[] args) {
		
		Function<String, String> f = Function.identity(); // Always returns input argument
		
		System.out.println(f.apply("java"));
		
	}
}
