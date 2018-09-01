package com.function1;

import java.util.function.Function;

public class StringLengthUsingFunction {

	public static void main(String[] args) {

		String input = "test fr";

		Function<String, Integer> f = s -> s.length();

		System.out.println(f.apply(input));

	}

}
