package exercises.fundamentals.inheritancePolymorphism.subClass;

import exercises.fundamentals.inheritancePolymorphism.superClass.Animal;

public class MuttAnimal extends Animal {
    public MuttAnimal(String name, String breed, Integer age) {

        super(name, breed, age);

    }
    public void latir(){
        System.out.println("Dog it is barking");
    }
}
