package ds_practice;

public class SecondLargestElement {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int secMax = max;
        int[] arr = {1,2,3,4,5,100,6,7,8,90};
        for(int i : arr){
            if(i>max){
                secMax = max;
                max = i;
            }
            else if(i>secMax){
                secMax = i;
            }
        }

        System.out.println("Maximum is : "+max + " and second maximum is : " + secMax);
    }
    
}