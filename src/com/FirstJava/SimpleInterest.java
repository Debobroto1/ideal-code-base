package com.FirstJava;

import java.util.Scanner;

/*
 * Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
 */

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the loan amount =");
		int principal=sc.nextInt();
		System.out.println("Enter the interest rate =");
		float rate=sc.nextFloat();
		System.out.println("Enter the time in terms of year ");
		float time=sc.nextFloat();
		calculate(principal,rate,time);
		sc.close();
	}
	
	static void calculate(int P,float R,float T) {
		double si=(P*R*T)/100;
		System.out.println("Total interest = "+si);
		
		double amount=P*(1+R*T);
		System.out.println("Total amount = "+amount);
		
		
		
		
	}
	
	

}
