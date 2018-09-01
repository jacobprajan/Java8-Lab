package com.methodreference2;

public class TestMethodRef2 {
	
	public static void main(String[] args) {
		
		TestMethodRef2 t = new TestMethodRef2();
		
		Interf f = t :: m2;
		
		f.m1();
		
	}

	public void m2() {
		System.out.println("Method Reference");
	}
}


interface Interf {
	
	void m1();
}
