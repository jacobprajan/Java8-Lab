package com.binary1;

import java.util.function.BinaryOperator;

public class TestBinaryOperator {

	public static void main(String[] args) {
		
		BinaryOperator<String> bi = (s1, s2) -> s1.concat(s2);
		
		System.out.println(bi.apply("Jack", " Paul"));
		
	}
	
}
