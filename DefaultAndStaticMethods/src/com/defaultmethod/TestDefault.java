package com.defaultmethod;

public class TestDefault implements IDefaultMethod, IDefaultMethod2{
	
	public void m1() {
		IDefaultMethod.super.m1();
	}

	public void m1(String s) {
		IDefaultMethod2.super.m1(s);
	}
	
	public static void main(String[] args) {

		TestDefault df = new TestDefault();
		df.m1();
		df.m1("Hello");

	}

}
