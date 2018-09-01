package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams5 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 4, 2, 6, 9, 8);
		
		Integer[] array = list.stream().toArray(Integer[] :: new);
		
		System.out.println(Arrays.toString(array));
		
		
		Stream<Integer> intStream = Stream.of(1, 2, 4, 3, 8);
		
		intStream.forEach(System.out :: println);
		
	}
}
