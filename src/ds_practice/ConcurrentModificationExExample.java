package ds_practice;

import java.util.*;

public class ConcurrentModificationExExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<=10;i++){
            list.add(i);
        }

        //caused concurrent modification exception, this can be solved using iterator
        for(int i : list){
            list.remove(i);
        }

        for(Iterator<Integer> it = list.iterator();it.hasNext();){
            Integer i = it.next();
            if(i == 2 ||i == 5 || i == 8 || i== 9){
                it.remove();
            }
        }

        System.out.println(list);

        list.removeIf(i -> i == 2 || i == 8 || i == 7 || i == 3);
        System.out.println(list);
        
    }
    
}