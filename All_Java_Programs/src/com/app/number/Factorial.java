package com.app.number;

import java.util.Scanner;

/* 5=5*4*3*2*1 */
public class Factorial {
	static int  fact=1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = sc.nextInt();
		
		for(int i=no; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

/*  i=5 5>=1  true   fact= fact*i   1*5 = 5
 *  i=4 4>=1 true    5*4= 20
 * */
