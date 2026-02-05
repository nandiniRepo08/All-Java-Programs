package com.app.number;

import java.util.Scanner;

public class Maximum {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int num1 = sc.nextInt();
		int num2= sc.nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1 + " is Maximum Number");
		}
		else {
			System.out.println(num2 + " is Maximum Number");
		}
		
	}

}
