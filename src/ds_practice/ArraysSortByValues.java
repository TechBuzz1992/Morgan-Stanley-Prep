package ds_practice;

import java.util.*;

public class ArraysSortByValues {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,6,7,8,9,-8,-9};
        System.out.println(Arrays.toString(new ArraysSortByValues().sortBySigns(arr)));
        
    }

    public int[] sortBySigns(int[] arr){
        Queue<Integer> negativeQ = new LinkedList<>();
        Queue<Integer> positiveQ = new LinkedList<>();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<0){
                negativeQ.add(arr[i]);
            }
            else{
                positiveQ.add(arr[i]);
            }
        }

        int index = 0;
        
        while(!negativeQ.isEmpty()){
            arr[index] = negativeQ.remove();
            index++;
        }
        while(!positiveQ.isEmpty()){
            arr[index] = positiveQ.remove();
            index++;
        }

        return arr;
    }

    
}