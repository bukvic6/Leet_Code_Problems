import java.util.ArrayList;
import java.util.List;

public class Person {
    public static void main(String[] args) {

        var p1 = new Person(34, "Michael", Gender.MALE);
        var p2 = new Person(17, "Jane", Gender.FEMALE);
        var p3 = new Person(28, "John", Gender.MALE);
        var p4 = new Person(47, "Peter", Gender.MALE);
        var p5 = new Person(27, "Lucy", Gender.FEMALE);

        var persons = List.of(p1, p2, p3, p4, p5);

        var result = new ArrayList<Person>();

        for (Person person: persons) {

            if (person.getAge() > 30) {

                result.add(person);
            }
        }

        System.out.println(result);
    }

}
