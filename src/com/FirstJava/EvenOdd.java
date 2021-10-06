package com.FirstJava;
/*
 * 1. Write a program to print whether a number is even or odd, also take
input.
 */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		validation(sc.nextInt());
		sc.close();
	}

	static void validation(int n) {
		if (n%2!=0) {
			System.out.println("Odd");			
		}
		else {
			System.out.println("Even");
		}
	}
}
