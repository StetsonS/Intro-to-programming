/*
Author Stetson Serna
Date 12/18/18
*/

import java.util.Scanner;
class Ex_6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Type in a Number Please: ");
			int n =input.nextInt();
			printMatrix(n);
			
		}
		public static void printMatrix(int n) {
			for (int x = 0; x < n; x++) {
			for (int y = 0; x < n; y++) {
				System.out.print((int) (Math.random() * 2)+ " ");
		}
		System.out.println();

		}
	}
}