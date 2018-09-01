package com.defaultmethod;

interface IDefaultMethod2 {
	default void m1() {
		System.out.println("IDefaultMethod2 : default m1");
	}

	default void m1(String s) {
		System.out.println("IDefaultMethod2 : default m1 with String input : " + s);
	}
}
