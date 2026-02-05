package com.app.number;

import java.util.Scanner;

/* 4*3 = 4*4*4 */

public class PowerOfNumber {
	
	static int result=1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = sc.nextInt();
		System.out.println("Enter Power");
		int power = sc.nextInt();
		
		
		for(int i=1; i<=power; i++ )
		{
			result = result*no;
			
		}
		System.out.println(result);
		
		
	}
	
	 

}
