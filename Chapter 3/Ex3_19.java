import java.util.Scanner;

public class Ex3_19{
    public static void main(String[] args){
    	//Declare variables
        Scanner in = new Scanner(System.in);
        
        //Prompt the user
        System.out.print("Enter a, b, c: ");
     
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        double perimeter = a+b+c; 
        
        //Check if sides make up triangle
        if((a+b)>c) {
        	System.out.println( " The sides make up a triangle ");
        	System.out.println( " Perimeter " + perimeter );
        }else{
        	System.out.println( " The sides do not make up a triangle " );
        }
     }
}