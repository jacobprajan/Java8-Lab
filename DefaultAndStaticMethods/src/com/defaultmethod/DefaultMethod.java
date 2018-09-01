package com.defaultmethod;

public class DefaultMethod implements IDefaultMethod {

	public static void main(String[] args) {

		IDefaultMethod df = new DefaultMethod();
		df.m1();
		df.m1("Hello");

	}

}
