package com.lambda.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListWithLambda
{
	public static void main( String[] args ) {

		List<Integer> list = Arrays.asList( 1, 4, 2, 3, 7, 6 );

		Comparator<Integer> r = ( o1, o2 ) -> {
			return (o1 > o2) ? -1 : (o2 > o1) ? 1 : 0;
		};

		// Collections.sort( list, r );

		// OR

		Collections.sort( list, ( o1, o2 ) -> {
			return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
		} );

		System.out.println( list );

	}
}
