package com.app.number;
//a=10 b=20       
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int Number1 = sc.nextInt();
		int Number2 = sc.nextInt();
		
		System.out.println("Before Swapping " +Number1+ ""+Number2);
		   temp=Number1;    //10----->number1
		   Number1=Number2;  //20------>number2
		   Number2=temp;      //
		   
		   System.out.println("After Swapping " +Number1+ "" +Number2);
		   
		
	}

}
