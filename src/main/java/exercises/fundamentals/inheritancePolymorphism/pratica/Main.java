package exercises.fundamentals.inheritancePolymorphism.pratica;

public class Main {
    public static void main(String[] args) {
        System.out.println("info patient:");
        Person patient = new Patient("pedro", 22, "123456", "048", "SUS");
        patient.printInfo();

        System.out.println("\n");

        System.out.println("Info nurse:");
        Person nurse = new Nurse("marcio", 24, "156677", 15, "Emergency Room", "03457");
        nurse.printInfo();
    }
}
