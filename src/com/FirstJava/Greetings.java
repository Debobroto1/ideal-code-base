package com.FirstJava;
//Take name as input and print a greeting message for that name
import java.util.Random;
import java.util.Scanner;

public class Greetings {

	public static void main(String[] args) {
		System.out.print("Enter a name: ");
		Scanner sc=new Scanner(System.in);
		greetings(sc.nextLine());

	}
	
	static void greetings(String name) {
		
		Random random = new Random(); 
		int n =random.nextInt(5);
		
		switch (n) {
		case 1 : System.out.println("Good Day"+" "+name); break;
		case 2 : System.out.println("Greetings"+" "+name);break;
		case 3 : System.out.println("Bravo"+" "+name);	  break;
		case 4 : System.out.println("Well Done"+" "+name);break;
		default : System.out.println("Good Day"+" "+name);break;
		}
		
		
		}
	
	}


