package exercises.fundamentals.inheritancePolymorphism.animal.car;

import exercises.fundamentals.inheritancePolymorphism.animal.car.carro.Carro;

public class MainVehicles {
    public static void main(String[] args) {
        Carro carro1 = new Carro("carro1", "sport1", 5);
        Carro carro2 = new Carro("carro2", "sport2", 5);

        System.out.println("----");

        System.out.println(carro1.brand);

        carro1.startEngine();
        carro1.drive();
        carro1.stopEngine();

        System.out.println("----");

        System.out.println(carro2.brand);
        carro2.startEngine();
        carro2.drive();
        carro2.stopEngine();
    }
}
