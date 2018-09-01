package com.bifunction1;

import java.util.function.BiFunction;

public class GetProductOfTwoNumbers {
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> bi = (a, b) -> a*b;
		
		System.out.println(bi.apply(3, 5));
		
	}

}
