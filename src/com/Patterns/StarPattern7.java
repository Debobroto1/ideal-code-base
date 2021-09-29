package com.Patterns;

/*
 		*
       ***
      *****
     *******
    *********
 */

public class StarPattern7 {
	
	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int noOfSpaces=1;noOfSpaces<=n-row;noOfSpaces++) {
				System.out.print(" ");
			}
				for(int col=1;col<=2*row-1;col++) {
					System.out.print("*");
			}
					
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern(5);

	}

}
