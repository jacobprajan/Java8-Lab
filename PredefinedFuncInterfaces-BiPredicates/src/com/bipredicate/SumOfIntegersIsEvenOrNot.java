package com.bipredicate;

import java.util.function.BiPredicate;

public class SumOfIntegersIsEvenOrNot {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bi = (a, b) -> (a+b)%2 == 0;
		
		System.out.println(bi.test(1, 2));
		
		System.out.println(bi.test(2, 2));
		
		System.out.println(bi.test(3, 3));
		
	}

}
