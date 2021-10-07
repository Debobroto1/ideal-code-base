package com.FirstJava;

import java.util.Scanner;

/*
 * 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
 */
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter the operator");
		char operator=sc.next().charAt(0);		
		System.out.print(num1+" "+operator+" "+num2+" = ");
		calculation(num1, num2, operator);
		
		;
	}
	
	static void calculation(int a,int b,char c) {
		switch (c) {
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '/':System.out.println(a/b);
		break;
		case '*':System.out.println(a*b);
		break;
		default:System.out.println("invalid entry");
		break;
		}
	}

}
