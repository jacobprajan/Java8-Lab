package com.bifunction1;

import java.util.function.BiFunction;

public class GetStudentObject {

	public static void main(String[] args) {

		BiFunction<String, Integer, Student> bi = (a, b) -> new Student(a, b);

		System.out.println(bi.apply("Jack", 10));

	}

}

class Student {
	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

}
