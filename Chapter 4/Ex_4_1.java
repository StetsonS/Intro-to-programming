/*
Author: Stetson Serna
Date: 10/26/2018
Excercise 4_1
*/
import java.util.Scanner;

class Ex_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Please enter the length from the center to the vertex ");
		double r = input.nextDouble();
		
		double s = (r + r) * Math.sin(Math.PI / 5);
		
		double area = 5 * s * s / (4 * Math.tan(Math.PI/5));
		
		System.out.println(" The area of the pentagon is " + area);
	}
}