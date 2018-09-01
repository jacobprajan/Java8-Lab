package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams4 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 2, 6, 9, 8);

		Optional<Integer> min = list.stream().min((i1, i2) -> i1.compareTo(i2));

		System.out.println("Min : " + min.get());

		Optional<Integer> max = list.stream().min((i1, i2) -> i2.compareTo(i1));

		System.out.println("Max : " + max.get());

		list.stream().forEach(i -> System.out.print(i + " "));
		
		System.out.println("");
		
		list.stream().forEach(System.out :: print);

	}

}
