package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 4, 2, 6, 9, 8);

		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());

		// List<Integer> sorted2 = list.stream().sorted(new MyComparator()).collect(Collectors.toList());

		List<Integer> sorted2 = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

		System.out.println(sorted);

		System.out.println(sorted2);

	}

}

/*
 * 
 * class MyComparator implements Comparator<Integer> {
 * 
 * @Override public int compare(Integer o1, Integer o2) {
 * 
 * return o2 - o1; }
 * 
 * }
 * 
 */
