package com.methodreference1;

import com.methodreference1.Interf;

public class TestMethodRef1 {
	
	public static void main(String[] args) {
		
		Interf f = TestMethodRef1 :: m2;
		
		// m1 refers m2 method. while m1 is called, m2 will be executed
		// We don't need to provide implementation for m1.
		// Biggest advantage of method reference is code reusability
		// Both methods should have same argument type
		// m2 can be static or instance method
		f.m1();
		
	}

	public static void m2() {
		System.out.println("Method Reference");
	}
}


interface Interf {
	
	void m1();
}
