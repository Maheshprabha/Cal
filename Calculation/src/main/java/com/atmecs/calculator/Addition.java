package com.atmecs.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Addition {
	 @SuppressWarnings({ "rawtypes", "resource" })
	public void addingList() {
		 //To get the input from user
		 ArrayList<List>arrlist = new ArrayList<List>(); 
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the size of the array :");
		int size = scan.nextInt();
		for(int i=0; i<=size;i++) {
			System.out.println("enter the input");
			@SuppressWarnings("unused")
			int data = scan.nextInt();
			arrlist.add(arrlist);
		    System.out.println(arrlist);

			
			 
		 }
	 }

}
