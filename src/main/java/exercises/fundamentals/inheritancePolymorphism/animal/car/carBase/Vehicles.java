package exercises.fundamentals.inheritancePolymorphism.animal.car.carBase;

public class Vehicles {
    public String brand;
    public String model;
    public Vehicles(String brand, String model){
            this.brand = brand;
            this.model = model;
    }
    public void startEngine(){
        System.out.println("Engine started.");
    }
    public void stopEngine(){
        System.out.println("Engine stopped.");
    }
    public  void drive(){
        System.out.println("Driving the car.");
    }
}
