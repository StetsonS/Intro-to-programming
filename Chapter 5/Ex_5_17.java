/*
Author: Stetson Serna
Date: 11/26/2018
*/

class Ex_5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
	
		// Prompt the user
		System.out.print(" Enter The Height of Pyramid ");
		user = scan.nextInt();
		
		// Re-prompt user if necessary
		while( user > 15 || user < 1) {
			System.out.print(" Enter height of pyramid (1 -15. ");
			user = scan.nextInt();
		}
		
		for (int count = 1; count <= user; count++) {
		}
	}
}