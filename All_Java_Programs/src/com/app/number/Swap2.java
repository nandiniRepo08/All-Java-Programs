package com.app.number;
//a=10 b=20

import java.util.Scanner;

public class Swap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println("Before Swapping "+number1+ " " +number2);
		// a=a+b  30=10+20   
		number1 = number1+number2;
		//b=a-b     20 =30-10
		number2 = number1-number2;
		
		//a=a-b
		number1 = number1-number2;
		
		System.out.println("After Swapping "+number1+ " " +number2);
	}

}
