package exercises.fundamentals.inheritancePolymorphism.pratica;

public class Patient extends Person {
    String registration;
    String healthInsurance;

    Patient(String name, int age, String document, String registration, String healthInsurance) {
        super(name, age, document);
        this.registration = registration;
        this.healthInsurance = healthInsurance;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("registration: " + this.registration);
        System.out.println("health Insurance: " + this.healthInsurance);
    }
}
