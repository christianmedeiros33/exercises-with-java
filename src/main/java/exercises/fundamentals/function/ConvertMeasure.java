package exercises.fundamentals.function;

// convert centimeter for inches
public class ConvertMeasure {
    public static void main(String[] args) {
        double centimeters = 1.9;
        double inches = convertCentimeterToInches(centimeters);
        System.out.println("Centimeter: " + centimeters+ " / per 2.54 = " + inches + " inches");
    }
    public static double convertCentimeterToInches( double centimeters) {
        return centimeters / 2.54;
    }

}
