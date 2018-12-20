/*
 * Author: Stetson Serna
 * Date: 12/19/18
 */

import java.util.Scanner; 
	class Ex6_37 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Type in a number: ");
			int num = input.nextInt();
			System.out.print("Type in the width: ");
			int width = input.nextInt();
			System.out.print(format(num,width));
				
		}
		public static String format(int number, int width) {
			String format = "";
			int size = 1;
			int num = number;
			while (num > 0) {
				size += 1;
				num = num /10;
			}
			if(width < size){
			format = Integer.toString(number);
			
				
			}
			else{
			width = width - size;
			for(int counter = 0; counter < width; counter++){
					format+= "o";
			}
			format += number;
			}
			return format;
		}
	}