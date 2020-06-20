package ds_practice;

class SingletonClass {
    private static volatile SingletonClass obj;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (obj == null) {
            synchronized (SingletonClass.class) {
                if (obj == null) {
                    System.out.println("Creating the object");
                    obj = new SingletonClass();
                }
            }
        }
        return obj;
    }
}

public class SingletonDP {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

    }

}