package exercises.fundamentals.inheritancePolymorphism.animal.classMain;
import exercises.fundamentals.inheritancePolymorphism.animal.subClass.CatAnimal;
import exercises.fundamentals.inheritancePolymorphism.animal.subClass.DogAnimal;

public class AnimalMain {
    public static void main(String[] args) {
        CatAnimal catAnimal = new CatAnimal("sprint", "mutt", 32);
        DogAnimal dogAnimal = new DogAnimal("rocha", "mutt", 20);
        catAnimal.meow();
        dogAnimal.bark();

    }
}
