package exercises.fundamentals.inheritancePolymorphism.animal.car.carro;

import exercises.fundamentals.inheritancePolymorphism.animal.car.carBase.Vehicles;

public class Carro extends Vehicles {
    private int place;

    public Carro(String brand, String model, int place) {
        super(brand, model);
        this.place = place;
    }

    public void drive() {
        System.out.println("Driving the carro.");
    }
}
