class Ex_6_3 {
	public static int reverse(int number) {
		int user = 0;
		int num = 0;
		int remain = 0;
		int reverse = 0;
	

		
		num = user;
			while (num != 0) {
				remain = num % 10;
				reverse = reverse * 10 + remain;
				num/=10;
			}

	public static boolean 1stPalindome(int number) {
		boolean isPalindrome = false;
			//call reverse method and check if palindrome
			
			return isPalindrome;

		public static void main(String [] args) {
			// Declare variables
			Scanner input = new Scanner(System.in);
			int user = 0;
			
			//prompt user
			System.out.print(" Enter a month ");
			user = input.nextInt();
			System.out.println("Is " + user + " a palindrome? " + isPalindrome(user));
		
	}
}