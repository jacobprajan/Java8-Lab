package com.bifunction2;

public class Employee {

	private String name;
	private int empNo;
	private double dailyWage;

	public Employee(String name, int empNo, double salary) {
		this.name = name;
		this.empNo = empNo;
		this.dailyWage = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", dailyWage=" + dailyWage + "]";
	}

	public String getName() {
		return name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public double getDailyWage() {
		return dailyWage;
	}

}
