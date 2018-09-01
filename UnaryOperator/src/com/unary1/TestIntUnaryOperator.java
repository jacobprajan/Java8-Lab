package com.unary1;

import java.util.function.IntUnaryOperator;

public class TestIntUnaryOperator {

	public static void main(String[] args) {
		
		IntUnaryOperator o = i -> i * i;

		System.out.println(o.applyAsInt(5));
		
	}
}
