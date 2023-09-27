package projectone;
import java.util.Scanner;

public class WeekDay {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find the corresponding weekday: ");
		int dayNumber = input.nextInt();
		
		String [] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		for(int i=1; i<6; i++ ) {
			if (dayNumber == i) {
				System.out.println(weekday[i-1]);
			}
		}
	}
}
