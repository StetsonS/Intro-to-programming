/*Author Stetson Serna
 * Date 10/11/2018
 */
import java.util.Scanner;
	class Ex_2_23 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);//New Scanner
	
	//User enters distance
	System.out.print(" Enter the Driving Distance ");
	double distance=input.nextDouble();
	
	//User enters Miles per Gallon
	System.out.print(" Enter miles per gallon ");
	double milesPerGallon=input.nextDouble();
			
	//User enter price per gallon
	System.out.print(" Enter price per gallon ");
	double pricePerGallon=input.nextDouble();
	
	// Compute the cost of driving
			double costOfDriving = (distance / milesPerGallon) * pricePerGallon;

			// Display result
			System.out.println(" The cost of driving is $ " + costOfDriving);
	}
}