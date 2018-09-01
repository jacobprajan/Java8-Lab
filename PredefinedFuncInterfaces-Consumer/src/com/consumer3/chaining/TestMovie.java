package com.consumer3.chaining;

import java.util.function.Consumer;

public class TestMovie {
	
	public static void main(String[] args) {
		
		
		Consumer<Movie> c1 = m -> System.out.println(m.getName() + " movie is ready to release.");
		
		Consumer<Movie> c2 = m -> System.out.println(m.getName() + " is " + m.getResult());
		
		Consumer<Movie> c3 = m -> System.out.println(m.getName() + " movie stored in database");
		
		Consumer<Movie> chainedC = c1.andThen(c2).andThen(c3);
		
		Movie m = new Movie("Bahubali", "Hit");
		
		chainedC.accept(m);
		
	}

}
