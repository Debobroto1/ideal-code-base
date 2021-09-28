package com.Patterns;

/*
 * 
 * 
 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 * 
 * 
 */


public class StarPattern4 {

	static void pattern(int n)	{
		for(int row=1;row<2*n;row++) {
			int totalColInRows= row<n ? row : 2*n-row;
			for(int col=0;col<totalColInRows;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
	public static void main(String[] args) {
		pattern(5);
	}

}
