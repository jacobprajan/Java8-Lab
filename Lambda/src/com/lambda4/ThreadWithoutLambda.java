package com.lambda4;

public class ThreadWithoutLambda implements Runnable
{

	@Override
	public void run() {

		for( int i = 1; i <= 10; ++i ) {
			System.out.println( "Child Thread : " + i );
		}

	}

	public static void main( String[] args ) {

		Thread t = new Thread( new ThreadWithoutLambda() );
		t.start();

		for( int i = 1; i <= 10; ++i ) {
			System.out.println( "Main Thread : " + i );
		}

	}

}
