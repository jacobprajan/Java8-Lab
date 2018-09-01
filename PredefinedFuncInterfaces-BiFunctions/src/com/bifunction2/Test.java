package com.bifunction2;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Jack", 101, 1000);
		
		TimeSheet tim = new TimeSheet(101, 25);
		
		BiFunction<Employee, TimeSheet, Double> bi = (e, t) -> e.getDailyWage() * t.getDays();
		
		System.out.println("Monthly salary : " + bi.apply(emp, tim));
		 
	}
	
}
