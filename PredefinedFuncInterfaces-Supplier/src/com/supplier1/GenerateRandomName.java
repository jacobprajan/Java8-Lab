package com.supplier1;

import java.util.function.Supplier;

public class GenerateRandomName {

	public static void main(String[] args) {

		Supplier<String> s = () -> {

			String[] names = { "Lijo", "Paul", "Max", "Jose" };

			//Random r = new Random();
			//int nextInt = r.nextInt(4);
			
			int nextInt = (int) (Math.random() * 4);

			return names[nextInt];
		};
		
		System.out.println(s.get());

	}

}
