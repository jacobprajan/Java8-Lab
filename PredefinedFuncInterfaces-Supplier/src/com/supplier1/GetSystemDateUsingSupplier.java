package com.supplier1;

import java.util.Date;
import java.util.function.Supplier;

public class GetSystemDateUsingSupplier {

	public static void main(String[] args) {
		
		Supplier<Date> s = () -> new Date();
		
		System.out.println(s.get());
		
		
	}
	
}
