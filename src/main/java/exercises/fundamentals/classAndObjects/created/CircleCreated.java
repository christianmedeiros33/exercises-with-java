package exercises.fundamentals.classAndObjects.created;

import exercises.fundamentals.classAndObjects.domain.Circle;

public class CircleCreated {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Calculation area: " + circle.calculatorArea());
        System.out.println("Calculation perimeter: " + circle.calculatorPerimeter());
    }

}
