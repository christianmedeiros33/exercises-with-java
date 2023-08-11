package exercises.fundamentals.controlStructure;
public class IfElse {
    public static void main(String[] args) {
        Integer number = 1;

        if (number >= 1) {
            System.out.println("Number positive");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }

    public void loop(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}

