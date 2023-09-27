package projectone;
import java.util.Scanner;
public class Floatingpoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a floating-point number: ");
		float numberInput = input.nextFloat();
		
		if (numberInput > 0) {
			if(numberInput < 1) {
				System.out.println("Positive Small Number");
			}
			
			else if (numberInput > 1000000){
				System.out.println("Positive Large Number");
			}
			else {
				System.out.println("Positive");
			}
		}
		else if (numberInput < 0)
        {
            if (Math.abs(numberInput) < 1)
            {
                System.out.println("Negative small number");
            }
            else if (Math.abs(numberInput) > 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}