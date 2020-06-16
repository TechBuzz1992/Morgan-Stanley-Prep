import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=10;i++){
            list.add(i);
        }

         System.out.println(list.stream().filter(a -> a%2 ==0).map(a -> a*a).collect(Collectors.toList()));

         System.out.println(list.stream().filter(a -> a%3 == 0).reduce((a,b) -> a+b).get());

         System.out.println(list.stream().sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList()));

         list.stream().filter(a -> a%3 !=0).map(a -> a*3).forEach(System.out :: println);

        
    }

    
}