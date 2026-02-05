package com.chars;

import java.util.Scanner;

/* Java Program to Check Vowel Or Consonant */

public class VowelOrConsonant {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Character");
       char ch = sc.next().charAt(0);
		      
		      
		      if(ch=='a' || ch=='e' || ch=='i' ||  ch=='o'|| ch=='u')
		      {
		    	  System.out.println(ch + " is Vowel");
		      }
		      
		      else {
		    	  
		    	  System.out.println(ch + " is Consonant");
		      }
		
		
	}

}
