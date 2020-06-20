package ds_practice;

import java.util.*;

public class SortedStackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(2);
        stack.push(7);
        stack.push(82);
        stack.push(19);
        stack.push(72);
        stack.push(92);
        stack.push(127);

        SortedStackExample obj = new SortedStackExample();
        //obj.stackTarversal(stack);

        stack = obj.sortedStack(stack);
        obj.stackTarversal(stack);

        
    }

    public Stack<Integer> sortedStack(Stack<Integer> stack){
        //Stack<Integer> s = new Stack<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        while(!stack.isEmpty()){
            maxHeap.offer(stack.pop());
        }
        System.out.println("\n"+stack.isEmpty());

        while(!maxHeap.isEmpty()){
            stack.push(maxHeap.remove());
        }
        return stack;

    }

    public void stackTarversal(Stack<Integer> stack){
        Stack<Integer> s = stack;
        while(!s.isEmpty()){
            System.out.print(s.pop() +" ");
        }
    }
    
}