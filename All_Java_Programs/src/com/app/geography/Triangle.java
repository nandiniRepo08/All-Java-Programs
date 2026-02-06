package com.app.geography;

import java.util.Scanner;

//Area of triangle
public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Sides");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double semipermeter = (a+b+c)/2;
		double areaOfTriangle=Math.sqrt(semipermeter * (semipermeter-a) * (semipermeter-b) * (semipermeter-c));
		System.out.println(areaOfTriangle);
		
		
		
	}

}
