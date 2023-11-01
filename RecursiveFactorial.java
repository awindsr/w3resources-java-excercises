public class FactorialCalculator {

  public static int calculateFactorial(int n) {
    if (n == 0) {
      return 1;
    }
    
    return n * calculateFactorial(n - 1);
  }

  public static void main(String[] args) {
    int[] numbers = {7, 12};

    for (int number : numbers) {
      int factorial = calculateFactorial(number);
      System.out.println("Factorial of " + number + " is: " + factorial);
    }
  }
}
