package com.NaturalNumbers;

import java.util.Scanner;

/* Java Program To Print First N Natural Number */

public class Natural {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int range = sc.nextInt();
		
		for(int i=1; i<=range; i++)
		{
			System.out.println(i);
		}
		
		
	}

}
