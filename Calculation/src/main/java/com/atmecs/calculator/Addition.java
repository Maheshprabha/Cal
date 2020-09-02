package com.atmecs.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Addition {

	public void addingList() {
		 //To get the input from user
		 ArrayList<Integer>arrlist = new ArrayList<Integer>(); 
		Scanner scan = new Scanner(System.in);
		 //System.out.println("Enter the size of the array :");
		System.out.println("Enter the elements :");
		while(scan.hasNextInt()) {
			arrlist.add(scan.nextInt());
		}
System.out.println(arrlist);
			
			 
		 }
	 

}
