package com.lambda1;

public class HelloWorld
{

	public static void main( String[] args ) {
		
		IHelloWorld hello = () -> System.out.println( "Hello World" ); 
		hello.sayHello();

	}

}
