import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();
        in.close(); // Close the scanner when done

        String classification = classifyNumber(input);
        System.out.println(classification);
    }

    public static String classifyNumber(double number) {
        if (number > 0) {
            if (number < 1) {
                return "Positive small number";
            } else if (number > 1000000) {
                return "Positive large number";
            } else {
                return "Positive number";
            }
        } else if (number < 0) {
            if (Math.abs(number) < 1) {
                return "Negative small number";
            } else if (Math.abs(number) > 1000000) {
                return "Negative large number";
            } else {
                return "Negative number";
            }
        } else {
            return "Zero";
        }
    }
}
