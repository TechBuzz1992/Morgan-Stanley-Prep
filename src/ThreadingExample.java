import java.util.*;

class TestThread extends Thread{
    public void run(){
        try{

            System.out.println("Thread with id : " + Thread.currentThread().getId() +" and has name" + Thread.currentThread().getName());
        }
        catch(Exception e){

            System.out.println("Exception caught");
        }
    }
}

class TestThread1 implements Runnable{

    @Override
    public void run() {
        try{

            System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName());
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }

    }
    
}
public class ThreadingExample {
    public static void main(String[] args) {
        for(int i = 1;i<=8;i++){
            Thread th = new Thread(new TestThread1());
            th.start();
        }
        
    }
    
}