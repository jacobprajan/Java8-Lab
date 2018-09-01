package com.supplier1;

import java.util.function.IntSupplier;

public class TestIntSupplier {
	
	public static void main(String[] args) {
		
		IntSupplier is = () -> (int) (Math.random() * 10);
		
		System.out.println(is.getAsInt());
		
	}

}
