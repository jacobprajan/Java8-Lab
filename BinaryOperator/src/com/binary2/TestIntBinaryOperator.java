package com.binary2;

import java.util.function.IntBinaryOperator;

public class TestIntBinaryOperator {

	public static void main(String[] args) {
		
		IntBinaryOperator ibo = (i1, i2) -> i1 + i2;
		
		System.out.println(ibo.applyAsInt(3, 5));
		
	}
	
}
