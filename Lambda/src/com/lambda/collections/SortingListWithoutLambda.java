package com.lambda.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingListWithoutLambda
{
	public static void main( String[] args ) {

		List<Integer> list = Arrays.asList( 1, 4, 2, 3, 7, 6 );

		Collections.sort( list, new MyComparator() );

		System.out.println( list );

	}
}
