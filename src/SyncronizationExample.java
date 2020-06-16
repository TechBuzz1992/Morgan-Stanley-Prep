import java.util.*;

class Sender {
    public void send(String str) {
        System.out.println("Sending the message : " + str);

        try {

            Thread.sleep(1000);

        } catch (Exception e) {

            System.out.println("Exception in sending the message");
        }
        System.out.println("Message : " + str + " sent!");
    }

}

class ThreadSender extends Thread {
    private String msg;
    Sender sender;

    ThreadSender(String str, Sender obj) {
        this.msg = str;
        this.sender = obj;
    }

    @Override
    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }

}

public class SyncronizationExample {
    public static void main(String[] args) {
        Sender sender = new Sender();

        ThreadSender sender1 = new ThreadSender("Hi", sender);
        ThreadSender sender2 = new ThreadSender("Bye", sender);

        sender1.start();
        sender2.start();

        try {
            sender1.join();
            sender2.join();
        } catch (Exception e) {
            System.out.println("Interruption");
        }

    }

}