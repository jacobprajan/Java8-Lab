package com.lambda.collections;

import java.util.Set;
import java.util.TreeSet;

public class SortingTreeSetWithoutLambda
{

	public static void main( String[] args ) {

		Set<Integer> set = new TreeSet<>();
		set.add( 5 );
		set.add( 2 );
		set.add( 8 );
		set.add( 1 );
		set.add( 4 );

		System.out.println( set );

		Set<Integer> set2 = new TreeSet<>( new MyComparator() );
		set2.add( 5 );
		set2.add( 2 );
		set2.add( 8 );
		set2.add( 1 );
		set2.add( 4 );

		System.out.println( set2 );

	}
}
