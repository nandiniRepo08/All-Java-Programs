package com.Odd_Even;

import java.util.Scanner;

/* Sum of Odd And Even Numbers */
public class SumOfOddAndEven {
	
	static int sum=0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int range = sc.nextInt();
		
		if(range % 2 == 0)
		{
			for(int i=0; i<=range; i=i+2)
			{
				sum = sum + i;
				System.out.println(sum);
			}
		}
		
		else {
			
			for(int i=1; i<=range; i=i+2)
			{
				sum = sum+i;
				System.out.println(sum);
			}
		}
	}

}
