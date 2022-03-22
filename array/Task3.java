package array;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr ={4,24,10, 100,5,78, 11, 25, 55};
        System.out.println(arr[3]); //100
        //print out numbers greater than 10

        int[] largenumbers=new int[arr.length];

        for (int t=0; t<arr.length; t++){
            if(arr[t]>10){
                largenumbers[t]=arr[t];
               // System.out.println(arr[t]);
            }
        }
        System.out.println(Arrays.toString(largenumbers));
        Arrays.sort(largenumbers);
        System.out.println(Arrays.toString(largenumbers));
    }
}
