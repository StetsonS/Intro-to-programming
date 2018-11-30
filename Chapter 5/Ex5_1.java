/* Author: Stetson Serna
 * Date: 11/28/18
 */

import java.util.Scanner;

	class Ex5_1
	 public static void main(String[] args) 
	 Scanner input = new Scanner(System.in);
		System.out.print(" Enter a positive or negative number (0 to quit)");
		 int num = input.nextInt();
		
		 if(num == 0) {;
			 System.exit(1);
		 }
		 int sum = 0;
		 int positiveCount= 0;
		 int negativeCount= 0;
		  sum = positiveCount + negativeCount;
		 while (num !=0) {
			 if(num <= -1)
					negativeCount++;
			 
			 else 
					positiveCount++;
		
			 num=input.nextInt();
			 }
				System.out.println(" Positive number " + positiveCount);
				System.out.println(" Negative number " + negativeCount);
				System.out.println(" Total " + sum );
				}
}
