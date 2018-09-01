package com.biconsumer2;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class IncrementSalary {
	
	public static void main(String[] args) {
		
		BiFunction<String, Double, Employee> biFunc = (name, salary) -> new Employee(name, salary);
		
		BiConsumer<Employee, Double> biCons = (emp, incrementSalary) -> emp.setSalary(emp.getSalary() + incrementSalary);
		
		Employee emp1 = biFunc.apply("Jack", 10000.0);
		
		biCons.accept(emp1, 500.0);
		
		System.out.println(emp1);
		
	}

}
