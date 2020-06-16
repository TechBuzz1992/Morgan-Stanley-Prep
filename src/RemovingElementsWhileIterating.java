import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemovingElementsWhileIterating {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for(int i = 1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int i = it.next();
            if(i%2 == 0){
                list.remove(i);
            }
        }

        System.out.println(list);
    }
    
}