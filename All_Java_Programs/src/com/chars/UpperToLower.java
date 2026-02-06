package com.chars;

import java.util.Scanner;

public class UpperToLower {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			char ch2 = Character.toLowerCase(ch);
			System.out.println("Lowercase Character " +ch2);
		}
		else {
			char ch2 = Character.toUpperCase(ch);
			System.out.println("Uppercase Character " + ch2);
		}
	}

}
