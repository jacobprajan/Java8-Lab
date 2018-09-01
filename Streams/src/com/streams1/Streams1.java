package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 4, 2, 6, 9, 8);
		
		List<Integer> evenList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		
		System.out.println(evenList);
		
		List<Integer> twiceTimesList = list.stream().map(i -> i * 2).collect(Collectors.toList());
		
		System.out.println(twiceTimesList);
		
	}

}
