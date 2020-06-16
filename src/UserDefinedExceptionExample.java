import java.util.*;

class MyException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    MyException() {

    }

    MyException(String str) {
        super(str);
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        int a = 890;
        try {
            if (a > 800) {
                MyException ex = new MyException("Value is greater than 800");
                throw ex;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I am here in finally");

        }

        System.out.println("I am here outside of exception world");

    }

}