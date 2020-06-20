package ds_practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 4, -1, 9, 2, 3, 4 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    // arr[j] = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}