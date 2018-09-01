package com.lambda3;

public class GetStringLength
{
	public static void main( String[] args ) {
		
		//IGetStringLength getStringLen = (s) -> {return s.length();};
		
		IGetStringLength getStringLen = s -> s.length();
		System.out.println( getStringLen.getlength( "Hello" ) ); 
		
	}
}
