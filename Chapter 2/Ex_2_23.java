/*Author Stetson Serna
 * Date 10/11/2018
 */
import java.util.Scanner;
	class Ex_2_23 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);//New Scanner
	
	//User enters distance
	System.out.print("Enter the Driving Distance");
	double distance=input.nextDouble();
	
	//User enters Miles per Gallon
	System.out.print("Enter miles per gallon");
	double miles per gallon=input.nextDouble();
			
	//User enter price per gallon
	System.out.print("Enter price per gallon");
	double price per gallon=input.nextDouble();
	
	// Compute the cost of driving
			double cost of driving = (distance / miles per gallon) * price per gallon;

			// Display result
			System.out.println("The cost of driving is $" + cost of driving);
	}
}