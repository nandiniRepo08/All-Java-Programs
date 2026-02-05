package com.Odd_Even;

import java.util.Scanner;

/* Print Odd Numbers Given Range */
public class OddNumberGivenRange {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int range = sc.nextInt();
		
		for(int i=1; i<=range; i=i+2)
		{
			System.out.println(i);
		}
	}

}
