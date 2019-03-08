/*Author Stetson Serna
Date 3/7/19
*/

import java.util.Scanner;

public class Ex_8_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < stateCapitals.length; i++) {
            System.out.print("What is the capital of " + stateCapitals[i][0]+"? ");
            String s = input.nextLine();
            if (s.equalsIgnoreCase(stateCapitals[i][1])) {
                System.out.println("You Right");
                correctCount++;
            } else {
                System.out.println("You wrong " + stateCapitals[i][1]);
            }
        }
        System.out.println("This is how much you got right nerd " + correctCount);
    }

    private static String[][] stateCapitals = {
                    {"Utah", "Salt Lake City"},
                    {"Illinois ", "Springfield"},
                    {"Narnia", "Wardrobe"},
                    {"Arkansas", "Little Rock"},
                    {"California", "Sacramento"},
                    {"Maine ", "Augusta"},
                    {"Connecticut", "Hartford"},
                    {"Vermont ", "Montpelier"},
                    {"Florida", "Tallahassee"},
                    {"Washington ", "Olympia"},
              
    };
}