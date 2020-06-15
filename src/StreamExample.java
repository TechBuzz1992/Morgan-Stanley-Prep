import java.util.*;
import java.util.stream.Collectors;

class Person {
    int id;
    String name;
    int num;

    Person(int id, String name, int num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {

        return "Person with name is:" + this.name + " and id is : " + this.id;

    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

        System.out.println("Orginal list");
        list.stream().forEach(System.out::println);

        List<Person> listOfPersons = new ArrayList<>();
        Person p1 = new Person(1, "harsh", 1);
        Person p2 = new Person(2, "tarak", 2);
        Person p3 = new Person(3, "xyz", 3);

        listOfPersons.add(p1);
        listOfPersons.add(p2);
        listOfPersons.add(p3);

        listOfPersons.stream().map(p -> p.name.length()).forEach(System.out::println);

        System.out.println(
                "Is Harsh present in the list?:" + listOfPersons.stream().anyMatch(p -> p.name.equals(("harsh"))));

        Optional<Person> p = listOfPersons.stream().filter(person -> person.name.equals("harsh")).findAny();

        System.out.println(p.toString());

        System.out.println("The sum of the numbers of the persons is : " + listOfPersons.stream().map(person->person.num).reduce((pe1,q1) -> pe1+q1).get());

        //HashMap<String,Integer> namesMap = listOfPersons.stream().map(a -> a.name).collect(Collectors.toMap(per->per.name, per->per.num));

        //System.out.println(namesMap.keySet());
    }

}