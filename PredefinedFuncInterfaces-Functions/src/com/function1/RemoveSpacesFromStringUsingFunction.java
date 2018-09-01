package com.function1;

import java.util.function.Function;

public class RemoveSpacesFromStringUsingFunction {

	public static void main(String[] args) {

		String input = "fe ewr rryr wewe";

		Function<String, String> f = s -> s.replaceAll(" ", "");

		//System.out.println(removeSpace(input, f));
		
		System.out.println(f.apply(input));

	}

	/*
	private static String removeSpace(String input, Function<String, String> f) {
		return f.apply(input);
	}
	
	*/

}
