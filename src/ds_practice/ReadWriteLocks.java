package ds_practice;

import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Foo {
    private String name;

    public Foo(String name) {
        this.name = name;
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }
}

class Example {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private Foo foo = new Foo("harsh");

    String getFooString() {
        lock.readLock().lock();
        String name;
        try {
            name = foo.getName();
        } finally {
            lock.readLock().unlock();
        }
        return name;
    }

    void setName() {
        lock.writeLock().lock();
        try {
            foo.setName("xyz");
        } finally {
            lock.writeLock().unlock();
        }
    }

}

public class ReadWriteLocks {
    public static void main(String[] args) {

    }

}