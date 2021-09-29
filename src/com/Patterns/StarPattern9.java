package com.Patterns;
/*
	*
   * *
  * * *
 * * * *
* * * * *
*/
public class StarPattern9 {
	
	
	static void pattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int noOfSpaces=0;noOfSpaces<n-row;noOfSpaces++) {
				System.out.print(" ");
			}
				for(int col=1;col<=row;col++) {
					System.out.print(" *");
			}
					
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
	 pattern(5);	
	}

}
