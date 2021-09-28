package com.Patterns;

/*
 	 *****
 	  ****
       ***
        **
         *

*/


public class StarPattern6 {

	static void pattern (int n) {
		for(int row=1;row<=n;row++) {	
			for(int noOfSpaces=0;noOfSpaces<row-1;noOfSpaces++) {
				System.out.print(" ");
			}
			for(int col=0;col<=n-row;col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		pattern (5);
	}

}
