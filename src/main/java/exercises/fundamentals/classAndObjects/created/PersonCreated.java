package exercises.fundamentals.classAndObjects.created;

import exercises.fundamentals.classAndObjects.domain.PersonProject;

public class PersonCreated {

    public static void main(String[] args) {
        PersonProject personProject = new PersonProject();
        personProject.setName("Christian");
        personProject.setSurname("Medeiros");
        personProject.setAge(22);
        System.out.println(personProject.getName() + " " +personProject.getSurname() +" "  + personProject.getAge() + " " );
    }
}
