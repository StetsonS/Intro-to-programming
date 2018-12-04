import java.util.Scanner;

class PalindromeCheck {
	public static void main(String[] args) {
		//Declare variables
		Scanner input = new Scanner(System.in);
		int user = 0;
		int num = 0;
		int remain = 0;
		int reverse = 0;
		//Prompt user
		System.out.print(" Enter a number: ");
		user = input.nextint ();
		
		//Reverse number
		num = user;
		while (num != 0) {
			remain = num % 10;
			reverse = reverse * 10 + remain;
			num/=10;
		}
		//check if palindromej
		if ( reverse == user)(
			System.out.println(user + " is a palindrome ");
		}
		else{
			System.out.println(user + " is not a palindrome ");as
		}
}