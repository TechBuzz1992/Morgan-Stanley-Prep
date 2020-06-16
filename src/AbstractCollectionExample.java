import java.util.*;

public class AbstractCollectionExample {
    public static void main(String[] args) {
        AbstractCollection<Object> list = new ArrayList<>();
        list.add("harsh");
        list.add(1);
        list.add(true);

        System.out.println(list);
    }
    
}