package com.FirstJava;

import java.util.Scanner;
/*
 * Input currency in rupees and output in USD.
 */


public class RupeeDollar {
	
	static double toDollar(double a) {
		a=a*0.16;
		return a;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount in Rupees to see the output in dollar");
		double rupee=sc.nextDouble();
		System.out.println("$ "+toDollar(rupee));
	}

}
