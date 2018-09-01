package com.unary1;

import java.util.function.UnaryOperator;

public class TestUnaryOperator {

	public static void main(String[] args) {

		// Function<Integer, Integer> fo = i -> i * i;

		// if input and return type in a function is same, it can be replaced with unary operator
		
		// It is the child of Function<T, T>

		UnaryOperator<Integer> o = i -> i * i;

		System.out.println(o.apply(5));

	}
}
