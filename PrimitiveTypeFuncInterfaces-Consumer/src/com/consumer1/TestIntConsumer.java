package com.consumer1;

import java.util.function.IntConsumer;

public class TestIntConsumer {

	public static void main(String[] args) {
		
		
		IntConsumer ic = i -> System.out.println(i*i);
		
		ic.accept(7);
		
	}
	
}
