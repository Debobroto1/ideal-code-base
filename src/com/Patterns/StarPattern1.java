package com.Patterns;

public class StarPattern1 {
	
	static void pattern(int n) {
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j < (2*i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pattern(5);
	}
}
