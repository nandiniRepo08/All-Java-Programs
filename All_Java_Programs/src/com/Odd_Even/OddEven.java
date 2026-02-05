package com.Odd_Even;

import java.util.Scanner;

/* Java Program to check number is Odd Or Even */


public class OddEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int no =sc.nextInt();
		
		
		if(no % 2 ==0)
		{
			System.out.println(no + " No is Even");
		}
		
		else {
			System.out.println(no + " No is Odd");
		}
	}
	
	

}
