package com.function2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGradeUsingFunction {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("Jack", 80));
		list.add(new Student("Max", 65));
		list.add(new Student("Paul", 70));
		list.add(new Student("Lijo", 55));
		list.add(new Student("Kelly", 30));

		Function<Student, String> f = s -> {
			if (s.getMarks() >= 80)
				return "A";
			else if (s.getMarks() >= 70)
				return "B";
			else if (s.getMarks() >= 60)
				return "C";
			else if (s.getMarks() >= 40)
				return "D";
			else
				return "E";
		};

		Predicate<Student> p = s -> s.getMarks() >= 60;

		for (Student s : list) {
			System.out.println(s.getName() + " : " + f.apply(s));
		}

		for (Student s : list) {
			if (p.test(s)) {
				System.out.println(s);
			}
		}

	}

}
