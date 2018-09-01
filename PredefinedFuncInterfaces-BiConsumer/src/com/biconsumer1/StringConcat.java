package com.biconsumer1;

import java.util.function.BiConsumer;

public class StringConcat {

	
	public static void main(String[] args) {
		
		BiConsumer<String, String> b = (s1, s2) -> System.out.println(s1.concat(s2));
		
		b.accept("Jack", " Paul");
		
	}
}
