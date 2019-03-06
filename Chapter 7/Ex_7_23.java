 /*
Author: Stetson Serna
Date: 2/15/19
*/

class Ex_7_23 {
	public static void main(String[] args) {
		
		boolean[] kewl = new boolean[100];
		int roblox = 0;
		
		for (int kewler = 1; kewler <=100; kewler++) {
			roblox=kewler-1;
			while (roblox < 100) {
				kewl[roblox] = !kewl[roblox];
				roblox = roblox + kewler;
			}		
		}
	
	
	System.out.println("The lockers still open are: ");		
	for (int kewler =1; kewler <= 100; kewler++) {
		if (kewl[kewler - 1] == true) {
			System.out.print(kewler + " ");
		}
	}
} 
}