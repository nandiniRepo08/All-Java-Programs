package com.app.geography;

import java.util.Scanner;

//Area of square = side*side;
public class Square {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter side");
	int side= sc.nextInt();
	
	int areaOfSquare=side*side;
	System.out.println("Area Of Square is " + areaOfSquare);
	
}
}
