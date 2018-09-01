package com.consumer2;

import java.util.function.ObjIntConsumer;

public class TestObjIntConsumer {

	public static void main(String[] args) {
		
		ObjIntConsumer<Integer> ic = (a, b) -> System.out.println(a*b);
		
		ic.accept(new Integer(5), 2);
	}
	
}
