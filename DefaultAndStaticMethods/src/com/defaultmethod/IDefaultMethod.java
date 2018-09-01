package com.defaultmethod;

public interface IDefaultMethod {
	default void m1() {
		System.out.println("IDefaultMethod : default m1");
	}

	default void m1(String s) {
		System.out.println("IDefaultMethod : default m1 with String input : " + s);
	}
}
