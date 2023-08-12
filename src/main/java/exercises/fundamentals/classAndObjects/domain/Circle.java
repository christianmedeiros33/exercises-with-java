package exercises.fundamentals.classAndObjects.domain;

public class Circle {
     private final double ray;

    public Circle(double ray) {
        this.ray = ray;
    }

    public double calculatorArea() {
        return Math.PI * ray * ray;
    }

    public double calculatorPerimeter() {
        return 2 * Math.PI * ray;
    }
}
