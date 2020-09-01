package com.atmecs.calculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	String empName;
	int empID;
	float empSalary;
	public void GetEmployeeDetails() {
		
		System.out.println(empName + " " + empID + " "  + empSalary + " ");
	}
	Employee(String empName , int empID , float empSalary){
{
		this.empName = empName;
		this.empID = empID;
		this.empSalary = empSalary;
		
	}
}
	public class EmployeeDataBase{
		ArrayList<Employee> list = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of employee : ");
		int empCount = scan.nextInt();
		for (int i=0; i<empcount; i++) {
			System.out.println("enter the employee name : ");
			String empName = scan.next();
			int empID = scan.nextInt();
			float empSalary = scan.nextFloat();
			}
		@SuppressWarnings("rawtypes")
		//Get the iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Employee i = (Employee) itr.next();
			System.out.println(i.empName);
		}
		Employee e = list.get(0);
		System.out.println(e);
		
		}
			
		}
		
		
	}
