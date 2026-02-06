package com.app.calculator;

import java.util.Scanner;

public class Calculator {
	static int cal;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int no1 = sc.nextInt();
		int no2= sc.nextInt();
		
		System.out.println("Select Operation /n 1 For Addition");
		int ch = sc.nextInt();
		
		if(ch==1)
		{
			cal=no1+no2;
			System.out.println("Addition " + cal);
			
		}
		
		else if(ch==2)
		{
			cal=no1-no2;
			System.out.println("Subtraction" + cal );
		}
		
		else if(ch==3)
		{
			cal=no1*no2;
			System.out.println(cal);
		}
	}

}
