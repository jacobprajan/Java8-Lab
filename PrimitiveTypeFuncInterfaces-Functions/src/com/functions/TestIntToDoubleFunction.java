package com.functions;

import java.util.function.IntToDoubleFunction;

public class TestIntToDoubleFunction {

	public static void main(String[] args) {
		
		IntToDoubleFunction f = i -> Math.sqrt(i);
		
		System.out.println(f.applyAsDouble(5));
		
	}
	
}
