package com.constructorreference1;

public class TestConstrRefUsingConstrctrRef {

	public static void main(String[] args) {

		Interef1 i = Sample1 :: new;

		System.out.println(i.get());

	}

}

class Sample1 {

	Sample1() {
		System.out.println("Sample1 constructor");
	}
}

interface Interef1 {
	Sample1 get();
}
