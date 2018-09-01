package com.lambda.collections;

import java.util.Set;
import java.util.TreeSet;

public class SortingTreeSetWithLambda
{
	public static void main( String[] args ) {

		Set<Integer> set = new TreeSet<>( ( i1, i2 ) -> {
			return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
		} );

		set.add( 5 );
		set.add( 2 );
		set.add( 8 );
		set.add( 1 );
		set.add( 4 );

		System.out.println( set );
	}
}
