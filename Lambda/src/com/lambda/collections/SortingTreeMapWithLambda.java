package com.lambda.collections;

import java.util.Map;
import java.util.TreeMap;

public class SortingTreeMapWithLambda
{
	public static void main( String[] args ) {

		// Descending sorting based on key

		Map<Integer, String> map = new TreeMap<>( ( i1, i2 ) -> {
			return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
		} );

		map.put( 5, "E" );
		map.put( 2, "B" );
		map.put( 8, "H" );
		map.put( 1, "A" );
		map.put( 4, "D" );

		for( Map.Entry<Integer, String> entry : map.entrySet() ) {
			System.out.println( entry.getKey() + " : " + entry.getValue() );
		}

	}
}
