package com.chars;

import java.util.Scanner;

public class WeekDay {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Code of the day");
	    int no = sc.nextInt();
	    
	    
	    switch(no)
	    {
	    case 0: System.out.println("Sunday");
	           break;
	           
	    case 1: System.out.println("Monday");
	    break;
	    
	    default:System.out.println("Wrong Choice");
	    }
	}

}
