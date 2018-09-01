package com.intpredicate;

import java.util.function.IntPredicate;

public class TestIntPredicate {
	
	public static void main(String[] args) {
		
		int[] input = {2, 1, 4, 7, 8};
		
		IntPredicate ip = i -> i % 2 == 0;
		
		for(int i : input) {
			if(ip.test(i)) {
				System.out.println(i);
			}
		}
		
	}

}
