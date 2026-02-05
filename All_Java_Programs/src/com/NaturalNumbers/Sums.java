package com.NaturalNumbers;

import java.util.Scanner;

/* Print First N Natural Number*/

public class Sums {
	
	static int sum=0;
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int range = sc.nextInt();
		
		for(int i=1; i<=range; i++)
		{
			     sum = sum+i;
			     System.out.println(sum);
			 
		}
	}

}
