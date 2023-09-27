package projectone;
import java.util.Scanner;

public class GreatestNumber {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Input third number: ");
        int thirdNumber = input.nextInt();
        
        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
        	System.out.println(firstNumber + " is greatest among the three numbers");
        }
        if(secondNumber > thirdNumber) {
        	System.out.println(secondNumber + " is greatest among the three numbers");
        }
        else {
        	System.out.println(thirdNumber + " is greatest among the three numbers");
        }


	}
}
