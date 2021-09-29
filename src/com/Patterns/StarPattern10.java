package com.Patterns;

public class StarPattern10 {
	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int noOfSpaces=1;noOfSpaces<=row-1;noOfSpaces++ ) {
				System.out.print(" ");
			}
			for(int col=1;col<=(n-row)+1;col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);

	}

}
