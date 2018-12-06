/*																												/*
Author: Stetson Serna
Date: 12/3/2018
*/

import java.util.Scanner;

class Ex_5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
	
		// Prompt the user
		System.out.print(" Enter The Height of Pyramid ");
		user = input.nextInt();
		
		// Re-prompt user if necessary
		while( user > 15 || user < 1) {
			System.out.print(" Enter height of pyramid (1 -15) ");
			user = input.nextInt();
		}
		// Counts rows
		for (int count = 1; count <= user; count++) {
			//print spaces
			for (int space = 1; space <= (user - count); space ++) {
				System.out.print("   ");
			}
			//print left side
			for (int left = count; left>= 1; left--){
				System.out.printf("%3d",left);
			}
			//Print right side 
			for ( int right= 2; right <= count; right++) {
				System.out.printf("%3d",right);
			}
			// End row
			System.out.println();
		}
	}
}
