package exercises.fundamentals;
public class LoopWhile {
    public static void main(String[] args) {

        Integer number = 15;
        while (number <= 25) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
    }

}
