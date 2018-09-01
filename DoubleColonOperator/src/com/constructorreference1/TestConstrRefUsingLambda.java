package com.constructorreference1;

public class TestConstrRefUsingLambda {

	public static void main(String[] args) {

		Interef i = () -> {
			Sample s = new Sample();
			return s;
		};

		System.out.println(i.get());

	}

}

class Sample {

	Sample() {
		System.out.println("Sample constructor");
	}
}

interface Interef {
	Sample get();
}
