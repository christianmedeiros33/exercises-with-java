package exercises.fundamentals;

/**
 * a) Escreva um programa que verifica se um número é positivo, negativo ou zero usando declarações if-else.
 * b) Use um loop for para imprimir os números pares de 1 a 10.
 * c) Implemente um loop while que imprime os números ímpares de 15 a 25.
 */

public class ifAndLoop {
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

