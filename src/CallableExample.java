import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableTest implements Callable<Object> {

    @Override
    public Object call() throws Exception {
        Random random = new Random();
        Integer i = random.nextInt(5);
        Thread.sleep(i * 100);
        return i;
    }

}

public class CallableExample {
    public static void main(String[] args) throws Exception{
        FutureTask[] tasks = new FutureTask[5];

        for(int i = 0;i<5;i++){
            Callable callable = new CallableTest();
            tasks[i] = new FutureTask(callable);
            Thread th = new Thread(tasks[i]);
            th.start();
        }

        for(int i = 0;i<5;i++){
            System.out.println((Integer) tasks[i].get());
        }

    }

}