package com.app.number;

import java.util.Scanner;

public class AverageOfMarks {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Subject Marks");
		double sub1 = sc.nextDouble();
		double sub2= sc.nextDouble();
		double sub3 = sc.nextDouble();
		double sub4= sc.nextDouble();
		double sub5 = sc.nextDouble();
		
		double sum= sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total Marks " +sum);
		
		double avearage = sum/5;
		System.out.println(avearage);
	}

}
