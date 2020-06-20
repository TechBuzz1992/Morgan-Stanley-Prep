package ds_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.util.*;

class Demo implements java.io.Serializable {

    private static final long serialVersionUID = 1499306118415941887L;

    final private static int id = 0;
    final private String name;

    public Demo(int id, String name) {
        id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Demo obj = new Demo(1, "harsh");
        String filename = "demo.ser";

        try {
            FileOutputStream stream = new FileOutputStream(filename);
            ObjectOutputStream objStream = new ObjectOutputStream(stream);

            objStream.writeObject(obj);

            objStream.close();
            stream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

        Demo object = null;

        try {
            FileInputStream stream = new FileInputStream(filename);
            ObjectInputStream objStream = new ObjectInputStream(stream);

            object = (Demo) objStream.readObject();

            System.out.println(object.getId() + " : " + object.getName());

            objStream.close();
            stream.close();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}