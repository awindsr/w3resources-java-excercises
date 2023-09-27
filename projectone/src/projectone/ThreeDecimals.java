package projectone;
import java.util.Scanner;
public class ThreeDecimals {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a first floating point number: ");
		float firstNumber = input.nextFloat();
		
		System.out.println("Enter a second floating point number: ");
		float secondNumber = input.nextFloat();
	
		
		firstNumber = Math.round(firstNumber * 1000);
		firstNumber = firstNumber / 1000;

		secondNumber = Math.round(secondNumber * 1000);
		secondNumber = secondNumber / 1000;

	     if (firstNumber == secondNumber)
	        {
	            System.out.println("Numbers are the same up to three decimal places");
	        }
	        else
	        {
	            System.out.println("Numbers are different");
	        }
		
	}
}
