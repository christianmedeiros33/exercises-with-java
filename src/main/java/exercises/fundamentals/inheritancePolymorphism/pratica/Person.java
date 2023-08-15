package exercises.fundamentals.inheritancePolymorphism.pratica;

public class Person {
    String name;
    int age;
    String document;

    Person(String name, int age, String document) {
        this.name = name;
        this.age = age;
        this.document = document;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("document: " + this.document);
    }
}
