package com.bharath.training.java;

import java.util.Scanner;

public class SumOfTeoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers");
		Scanner scanner = new Scanner(System.in);
		int num1 = Integer.parseInt(scanner.next());
		int num2 = Integer.parseInt(scanner.next());
		int result = num1 + num2;
		System.out.println("Sum is " + result);
	}

}
