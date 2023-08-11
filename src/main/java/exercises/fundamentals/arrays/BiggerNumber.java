package exercises.fundamentals.arrays;

/*
b) Declare um array de números inteiros e calcule a média dos valores.
c) Escreva um programa que encontre o valor máximo em um array de números.
 */
public class BiggerNumber {
    public static void main(String[] args) {
        double[] listOfNumbers = {3.5, 5.6, 8.9, 3.9};

        double max = listOfNumbers[0];

        for (double listOfNumber : listOfNumbers) {
            if (listOfNumber > max) {
                max = listOfNumber;
            }
        }

        System.out.println(max);
    }
}
