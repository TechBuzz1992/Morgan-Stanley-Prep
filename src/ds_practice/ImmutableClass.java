package ds_practice;

final class Employee1 {
    final int id;
    final String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

public class ImmutableClass {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1(1, "Harsh");
        //e1.id = 34;
    }

}