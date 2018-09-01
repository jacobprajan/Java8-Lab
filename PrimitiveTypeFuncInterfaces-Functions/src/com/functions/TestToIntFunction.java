package com.functions;

import java.util.function.ToIntFunction;

public class TestToIntFunction {

	public static void main(String[] args) {
		
		ToIntFunction<String> f = s -> s.length();
		
		System.out.println(f.applyAsInt("jack paul"));
		
	}
	
}
