package com.employeemanage.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Jack", "Developer", 10000, "Bangalore"));
		employees.add(new Employee("Steve", "CEO", 50000, "Delhi"));
		employees.add(new Employee("Max", "TeamLead", 30000, "Bangalore"));
		employees.add(new Employee("Paul", "Developer", 20000, "Cochi"));
		employees.add(new Employee("Lijo", "Manager", 40000, "Cochi"));
		employees.add(new Employee("Kelly", "Manager", 40000, "Bangalore"));

		Predicate<Employee> p1 = emp -> emp.getDesignation().equals("Manager");
		display(p1, employees);
		
		Predicate<Employee> p2 = emp -> emp.getCity().equals("Bangalore");
		display(p2, employees);
		
		Predicate<Employee> p3 = emp -> emp.getSalary()<30000;
		display(p3, employees);
		
		display(p1.and(p2), employees);
		
		display(p1.or(p3), employees);
		
		display(p1.negate(), employees);

	}

	private static void display(Predicate<Employee> p, List<Employee> employees) {

		for (Employee emp : employees) {
			if (p.test(emp)) {
				System.out.println(emp);
			}
		}
		
		System.out.println("***********************************************");
	}

}
