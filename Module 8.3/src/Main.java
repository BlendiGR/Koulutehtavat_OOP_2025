import java.util.ArrayList;
import java.util.Comparator;

class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person, name='" + name + "', age=" + age + ", city='" + city + "'";
    }
}

public class Main {
    private static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        Person person1 = new Person("Blendi", 23, "Vantaa");
        Person person2 = new Person("Zog the Destroyer", 97, "Vantaa");
        Person person3 = new Person("Karen the Complainer", 45, "Helsinki");
        Person person4 = new Person("Bob the Blob", 12, "Helsinki");
        Person person5 = new Person("Elon Musk's Clone", 5, "Helsinki");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);


        persons.sort(Comparator.comparingInt(p -> p.age));
        System.out.println("Sorted by age (ascending):");
        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println();

        persons.removeIf(p -> !p.city.equals("Helsinki"));
        System.out.println("Filtered to only Helsinki:");
        for (Person p : persons) {
            System.out.println(p);
        }
        System.out.println();
    }
}