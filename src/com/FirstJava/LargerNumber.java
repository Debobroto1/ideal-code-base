package com.FirstJava;

import java.util.Scanner;

/*
 * Take 2 numbers as input and print the largest number.
 */

public class LargerNumber {
	static void  compare(int a,int b) {
		if (b>a) 
			System.out.println(b+" is larger number");
		else
			System.out.println(a+" is larger number");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hit each number and hit enter for comparision");
		compare(sc.nextInt(),sc.nextInt());

	}

}
