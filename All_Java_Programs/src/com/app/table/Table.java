package com.app.table;

import java.util.Scanner;

/* 2= 2*1 2*2 2*3 2*4 */
public class Table {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
        int no = sc.nextInt();
        for(int i=1; i<=10; i++)
        {
        	  no=no*i;
        	  System.out.println(no+ "*" +i+"=" +no*i);
        	  
        }
		
	}

}

/* i=1  1<=10  1*1  1    */