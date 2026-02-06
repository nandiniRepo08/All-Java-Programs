package com.app.geography;

import java.util.Scanner;

// Area Of Circle=3.14*r*r;
public class Circle {
public static void main(String[] args) {
	
	double pi=3.14,areaOfCircle;
	
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter radius");
	double radius = sc.nextDouble();
	
	
	areaOfCircle=pi*radius*radius;
	System.err.println("Area Of Circle is " + areaOfCircle);
	
}
}
