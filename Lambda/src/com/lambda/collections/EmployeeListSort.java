package com.lambda.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeListSort
{

	public static void main( String[] args ) {
		
		Employee e1 = new Employee( 1, "Paul" );
		Employee e2 = new Employee( 3, "Kelly" );
		Employee e3 = new Employee( 2, "Max" );
		
		List<Employee> list = Arrays.asList( e1, e2, e3 );
		
		System.out.println("Before sort : " + list );
		
		Collections.sort( list, (emp1, emp2) -> {return (emp1.geteNo() > emp2.geteNo())? -1 : (emp1.geteNo() > emp2.geteNo())? 1 : 0; });
		
		System.out.println("After sort : " + list );
		
	}
}
