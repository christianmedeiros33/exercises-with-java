package exercises.fundamentals;


public class AverageOfIntegers {
    public static void main(String[] args) {

        double[] numbersInterger = {1, 4, 6, 7.4, 98};
        double valuesSum = 0;

        for (double value : numbersInterger) {
            valuesSum += value;
        }

        double averageValues = valuesSum / numbersInterger.length;
        System.out.println(averageValues);

    }
}
