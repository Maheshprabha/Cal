package com.atmecs.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Employee implements Comparable<Employee> {
	 private String empName;
	 private int empID;
	 private String empSkils;
	private Object Comparator;
	public void GetEmployeeDetails() {
		
	}
	public Employee(int empID , String empName , String empSkills){
{
		this.empName = empName;
		this.empID = empID;
		this.empSkils = empSkils;
		
	}

}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpSkils() {
		return empSkils;
	}
	public void setEmpSkils(String empSkils) {
		this.empSkils = empSkils;
	}

        List<Employee> employees = new ArrayList<>();
        {
        employees.add(new Employee(1010, "Raj", "sql"));
        employees.add(new Employee(1004, "mahesh", "java"));
        employees.add(new Employee(1015, "prabha", "c++"));
        {
        System.out.println("Employees : " + employees);
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Name) : " + employees);
        
        Collections.sort(employees, Comparator.comparing(Employee::getSkills));
        System.out.println("\nEmployees (Sorted by Skills) : " + employees);
      
        Collections.sort(employees, Comparator.comparing(Employee::getId));
        System.out.println("\nEmployees (Sorted by id) : " + employees);
        }
        }
		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return 0;
		}

		}




	/*public class EmployeeDataBase{
		ArrayList<Employee> list = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of employee : ");
		int empCount = scan.nextInt();
		for (int i=0; i<empCount; i++) {
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
		}*/
/*		Employee e = list.get(0);
		System.out.println(e);
*/		
		
			
		
		
		
	
