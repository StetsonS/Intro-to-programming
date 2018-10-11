/*
  Author Stetson Serna
  Date 10/11/18
 */
import java.util.Scanner;

	class Ex_2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	// Create a new Scanner object.
		final double MONTHLY_INTEREST_RATE = 0.00417;	// Initialize constant value

		// user enters monthly value
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

		// First months value
		double total = 100 * (1 + MONTHLY_INTEREST_RATE);
		// second months value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// third months value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// forth months value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// fifth months  value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// sixth months  value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

		// Display result
		System.out.println("After the sixth month, the account value is " + total);
	}
}
