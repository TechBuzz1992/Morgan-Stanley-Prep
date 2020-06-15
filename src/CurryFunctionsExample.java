//import java.util.*;
import java.util.function.Function;

public class CurryFunctionsExample {
    public static void main(String[] args) {
        Function<Integer, Function<Integer,Integer>> adder = u -> v -> u+v; 

        System.out.println(adder.apply(2).apply(3));
        
    }
    
}