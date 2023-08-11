package exercises.fundamentals.classAndObjects.created;

import exercises.fundamentals.classAndObjects.domain.CarProject;

public class CarCreated {
    public static void main(String[] args) {
        CarProject carProject = new CarProject();
        carProject.setName("Mustang");
        carProject.setModel("Sport");
        carProject.setAge(2024);
        System.out.println(carProject.getName() + " " + carProject.getModel() + " " + carProject.getAge());
    }
}
