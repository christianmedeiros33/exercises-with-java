package exercises.fundamentals.operators;
public class OperatorDivision {
    public static void main(String[] args) {
        Integer number = 15;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("is divisible for 3 and 5");
        } else {
            System.out.println(false);
        }

    }
}
