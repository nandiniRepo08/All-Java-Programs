package com.chars;

import java.util.Scanner;

/* Java Program To Print ASCII Value */
public class ASCII {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Character");
		char ch = sc.next().charAt(0);
		
		int a = ch;
		System.out.println("ASCII value of "+ch+ " is " + a );
	}

}
