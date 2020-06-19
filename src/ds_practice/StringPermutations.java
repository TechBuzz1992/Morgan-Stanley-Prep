package ds_practice;

import java.util.*;

/**
 * 
 * Complexity is O(n*n!) as O(n!) to calculate all permutations and O(n) to print the permutations
 */

public class StringPermutations {
    static List<String> strPermutations = new ArrayList<>();
    public static void main(String[] args) {
        getAllPermutations("AB");

        System.out.println(strPermutations);
        
    }

    public static void getAllPermutations(String str){
        
        if(str == null || str.length() == 0){
            return;
        }
        permute(str,0,str.length()-1);
    }

    public static void permute(String str, int l, int r){
        if(l == r){
            strPermutations.add(str);
        }
        else{
            for(int i = l;i<=r;i++){
                str = swap(str,l,i);
                permute(str,l+1,r);
                str = swap(str,l,i);
            }
        }

    }

    public static String swap(String str, int i, int j){
        char temp;
        char[] arr = str.toCharArray();
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
    
}