package exercises.fundamentals.inheritancePolymorphism.animal.subClass;

import exercises.fundamentals.inheritancePolymorphism.animal.superClass.Animal;

public class DogAnimal extends Animal {
    public DogAnimal(String name, String breed, Integer age) {
        super(name, breed, age);
    }
    public void bark() {
        System.out.println("Dog it is barking");
    }
}
