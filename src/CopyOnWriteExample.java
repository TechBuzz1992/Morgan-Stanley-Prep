import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            list.remove(it.next());
        }
        
        System.out.println(list);


    }
    
}