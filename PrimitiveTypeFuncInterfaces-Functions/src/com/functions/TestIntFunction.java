package com.functions;

import java.util.function.IntFunction;

public class TestIntFunction {
	
	public static void main(String[] args) {
		
		IntFunction<Integer> intf = i -> i*i;
		
		System.out.println(intf.apply(3));
		
	}

}
