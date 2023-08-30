import java.util.ArrayList;
import java.util.List;

public class Persone {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person jj = new Person(9,"jana",Gender.FEMALE);
        Person jffj = new Person(30,"jaddna",Gender.FEMALE);
        Person sfjj = new Person(10,"jdddana",Gender.FEMALE);

        persons.add(jj);
        persons.add(jffj);
        persons.add(sfjj);
        List<Person> dd = new ArrayList<>();
        for(Person person : persons){
            if (person.getAge() < 20){
                dd.add(person);
            }

        }
        System.out.println(dd);




    }
    enum Gender {
        MALE, FEMALE
    }



}
