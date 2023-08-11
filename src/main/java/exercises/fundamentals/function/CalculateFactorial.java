package exercises.fundamentals.function;


public class CalculateFactorial {
    public static void main(String[] args) {
        int number = 22;
        int numberFactorial = calculatorFactorial(number);
        System.out.println("The factorial " + number + " is: " + numberFactorial);
    }

    public static int calculatorFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculatorFactorial(n - 1);
        }
    }
}
