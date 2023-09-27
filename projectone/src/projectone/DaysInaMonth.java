package projectone;
import java.util.Scanner;

public class DaysInaMonth {
    public static void main(String[] args) {
        String[][] months31 = {
                {"January", "March", "May", "July", "August", "October", "December"},
                {"1", "3", "5", "7", "8", "10", "12"}
        };
        String[][] months30 ={
                {"April", "June", "September", "November"},
                {"4", "6", "9", "11"}
        };

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the month: ");
        int monthNumber = input.nextInt();

        String monthName = getMonthName(monthNumber);

        if (monthName != null) {
            int year;
            System.out.println("Enter the year: ");
            year = input.nextInt();

            int numberOfDaysInMonth = getNumberOfDaysInMonth(monthNumber, year);
            System.out.println(monthName + " " + year + " has " + numberOfDaysInMonth + " days");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }

    public static String getMonthName(int monthNumber) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (monthNumber >= 1 && monthNumber <= 12) {
            return monthNames[monthNumber - 1];
        } else {
            return null;
        }
    }

    // Function to get the number of days in a month
    public static int getNumberOfDaysInMonth(int monthNumber, int year) {
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29; // Leap year
                } else {
                    return 28; // Not a leap year
                }
            default:
                return 0; // Invalid month
        }
    }
}
