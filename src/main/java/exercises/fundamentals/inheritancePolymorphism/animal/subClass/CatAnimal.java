package exercises.fundamentals.inheritancePolymorphism.animal.subClass;

import exercises.fundamentals.inheritancePolymorphism.animal.superClass.Animal;

public class CatAnimal extends Animal {
    public CatAnimal(String name, String breed, Integer age) {
        super(name, breed, age);
    }
    public  void meow(){
        System.out.println("Cat it is meowing");
    }
}
