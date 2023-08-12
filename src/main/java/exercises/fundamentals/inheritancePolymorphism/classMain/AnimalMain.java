package exercises.fundamentals.inheritancePolymorphism.classMain;

import exercises.fundamentals.inheritancePolymorphism.subClass.CatAnimal;
import exercises.fundamentals.inheritancePolymorphism.subClass.DogAnimal;

public class AnimalMain {
    public static void main(String[] args) {
        CatAnimal catAnimal = new CatAnimal("sprint", "mutt", 32);
        DogAnimal dogAnimal = new DogAnimal("rocha", "mutt", 20);
        catAnimal.meow();
        dogAnimal.bark();

    }
}
