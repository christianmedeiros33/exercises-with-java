package exercises.fundamentals.function;

public class NumberIsCousin {
    public static void main(String[] args) {
        int number = 23;

        if (isCousin(number)) {
            System.out.println("is cousin");
        } else {
            System.out.println("not cousin");
        }
    }

    public static boolean isCousin(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}