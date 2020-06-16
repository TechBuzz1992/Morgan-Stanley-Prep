import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.io.*;
import java.sql.Date;

class Task extends Thread implements Runnable {

    @Override
    public void run() {
        System.out.println(new java.util.Date().getTime());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}

public class ExecutorServiceExample {
    static final int MAX_TH = 3;
    public static void main(String[] args) {
        Runnable task1 = new Task();
        Runnable task2 = new Task();
        Runnable task3 = new Task();
        Runnable task4 = new Task();
        Runnable task5 = new Task();

        ExecutorService pool = Executors.newFixedThreadPool(MAX_TH);

        pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);
        pool.execute(task4);
        pool.execute(task5);
        
        pool.shutdown();

    }
    
}