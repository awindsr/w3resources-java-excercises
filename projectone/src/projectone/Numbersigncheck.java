package projectone;

import java.util.Scanner;

public class Numbersigncheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is positive or negative: ");
		int number = sc.nextInt();
		
		if (number > 0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}

	}
}
