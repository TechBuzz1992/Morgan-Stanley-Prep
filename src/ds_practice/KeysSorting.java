package ds_practice;

import java.util.*;

class Test implements Comparable<Test> {
    private int id;
    private String name;
    private int key;

    public Test(int id, String name, int key) {
        this.id = id;
        this.name = name;
        this.key = key;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String toString(){
        return "[ Test : " + " : " + this.getId() + " : " + this.getName() + " : " + this.getKey() + " ]";
    }

    @Override
    public int compareTo(Test o) {
        return this.getKey() - o.getKey();
    }

}

class SortByKey implements Comparator<Test> {

    @Override
    public int compare(Test o1, Test o2) {
        return o1.getKey() - o2.getKey();
    }

}

public class KeysSorting {
    public static void main(String[] args) {
        TreeMap<Test,String> map = new TreeMap<Test,String>();
        //TreeMap<Test,String> map = new TreeMap<Test,String>(new SortByKey());
        map.put(new Test(1,"harsh",121),"harsh");
        map.put(new Test(2,"xyz",381),"xyz");
        map.put(new Test(3,"klm",331),"klm");

        for(Map.Entry<Test,String> e: map.entrySet()){
            System.out.println(e.getKey());
        }


    }

}