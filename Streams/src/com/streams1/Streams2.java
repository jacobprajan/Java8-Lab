package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams2 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Jack Paul", "Max Kelly", "Kevin John", "John Jaison");
		
		List<String> collect = list.stream().filter(s -> s.length() >9).collect(Collectors.toList());
		
		System.out.println(collect);
		
		List<String> collect2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		long count = list.stream().filter(s -> s.length() >9).count();
		
		System.out.println(count);
		
	}
	
}
