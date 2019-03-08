/*
Author: Stetson Serna
Date: 2/22/2019

Programs sums two 3x3 matrices
*/
import java.util.Scanner;

class Ex8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double oj[][] = new double [3][3]; // Matix A
		double aj[][] = new double [3][3]; // Matrix B
		double[][] oreos = new double [3][3]; //Marix C

		// Prompt user for Matrix A
		for ( int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for row" + (row + 1)+ " for Matrix A:");
			for (int col = 0; col <= 2; col++) {
				oj [row][col] = input.nextDouble();
			}
		}
	//Prompt user for Matrix B
	
	
		for ( int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for row" + (row + 1)+ " for Matrix B:");
			for (int col = 0; col <= 2; col++) {
				aj [row][col] = input.nextDouble();
			}
		}
			oreos = addMatrix(oj, aj);
			
			for (int row = 0; row < oreos.length; row++ ){
			
				for (int col = 0; col < oreos[0].length; col++){
					System.out.print(oreos[row][col] + " ");
					//print end of row
					System.out.println(oreos[row][col]+ " ");
				}
			}
		}
			public static double[][] addMatrix(double[][] a, double[][] b) {
				double [][] c = new double [3][3];
				
				for (int row = 0; row < c.length; row++){
					for (int col = 0; col < c [0].length; col++){
						c[row][col] = a[row][col] + b[row][col];
					}
				}
				
				return c;
	}
}
