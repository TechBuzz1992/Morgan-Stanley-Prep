public class ExceptionTest {
    public static void main(String[] args) {
        String str = null;
        try{
        
        System.out.println(str.length());
    
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception has occured : " + e.getMessage());
        }
        finally{
            System.out.println("Finally I am executed");
        }

        System.out.println("I am here to interrupt again :)");
    }

}