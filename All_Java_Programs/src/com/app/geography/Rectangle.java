package com.app.geography;

import java.util.Scanner;
//Area of Rectangle

public class Rectangle {
	static int rect;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		double length = sc.nextDouble();
		System.out.println("Enter breath");
		double breath = sc.nextDouble();
		
		rect=(int) (length*breath);
		System.out.println("Area Of Rectangle is "  + rect);
				
	}

}
