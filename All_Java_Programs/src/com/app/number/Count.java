package com.app.number;

import java.util.Scanner;

/* count digit number 4670---->4*/
public class Count {
	public static void main(String[] args) {
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = sc.nextInt();
		
		while(no>0)
		{
			
			no= no/10;
			count++;
		}
		System.out.println(count);
	}

}
