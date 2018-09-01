package com.lambda2;

public class AddNumbers
{
	public static void main( String[] args ) {
		
		IAddNumbers addNum = (a, b) -> System.out.println( a + b );
		addNum.add( 10, 20 );
		addNum.add( 5, 9 );
	}
}
