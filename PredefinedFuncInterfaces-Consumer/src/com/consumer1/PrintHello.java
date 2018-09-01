package com.consumer1;

import java.util.function.Consumer;

public class PrintHello {
	
	public static void main(String[] args) {
		
		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("Hello");
		
		c.accept("Bye");
		
	}

}
