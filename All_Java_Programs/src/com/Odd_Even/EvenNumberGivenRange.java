package com.Odd_Even;

import java.util.Scanner;

/* Print Even Numbers in given range */
public class EvenNumberGivenRange {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int range = sc.nextInt();
		
		for(int i=0; i<=range; i=i+2)
		{
			System.out.println(i);
		}
	}

}
