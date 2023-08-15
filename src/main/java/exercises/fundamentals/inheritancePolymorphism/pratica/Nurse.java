package exercises.fundamentals.inheritancePolymorphism.pratica;

public class Nurse extends Person {
    int timeToWork;
    String sector;
    String registrationNumber;

    Nurse(String name, int age, String document, int timeToWork, String sector, String registrationNumber) {
        super(name, age, document);
        this.timeToWork = timeToWork;
        this.sector = sector;
        this.registrationNumber = registrationNumber;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("time To Work: " + this.timeToWork);
        System.out.println("sector : " + this.sector);
        System.out.println("registration Number : " + this.registrationNumber);
    }
}
