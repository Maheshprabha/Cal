package com.atmecs.calculator;

import java.util.Scanner;

@SuppressWarnings("serial")
public class Multiplication extends Exception {

	public void multilpleOperations() {
	@SuppressWarnings("resource")
		//Getting input from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements you want to multiply : ");
		int size = scan.nextInt();
		try {
            // initialize the array
			int myArray[] = new int[size];
			int product = 1;
			System.out.println("Enter the elements ");
			for (int i = 0; i < size; i++) {
				//scans the next token of the input
				myArray[i] = scan.nextInt();
				product = product * myArray[i];
			}
			System.out.println("Sum of the elements of the array ::" + product);

		} catch (Exception ex) {
			

		}
	}
}
