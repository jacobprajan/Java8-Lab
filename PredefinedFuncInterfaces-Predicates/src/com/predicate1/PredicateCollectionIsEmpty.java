package com.predicate1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateCollectionIsEmpty {
	
	public static void main(String[] args) {
		
		Predicate<Collection> p = c -> c.isEmpty();
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		System.out.println(p.test(list1));
		System.out.println(p.test(list2));
	}

}
