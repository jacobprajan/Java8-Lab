package com.methodreference3;

public class ThreadUsingMethodReference {

	public static void main(String[] args) {

		ThreadUsingMethodReference t = new ThreadUsingMethodReference();
		Runnable r = t::m1;

		Thread th = new Thread(r);
		th.start();

		for (int i = 0; i < 10; ++i) {
			System.out.println("Main thread : " + i);
		}

	}

	public void m1() {
		for (int i = 0; i < 10; ++i) {
			System.out.println("Child thread : " + i);
		}
	}

}
