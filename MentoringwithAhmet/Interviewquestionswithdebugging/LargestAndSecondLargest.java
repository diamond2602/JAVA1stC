package MentoringwithAhmet.Interviewquestionswithdebugging;

import java.util.Arrays;

public class LargestAndSecondLargest {

    //Write a java program that Find the largest and second largest with the sort method from the array
    // Interview Question:


    public static void main(String[] args) {
        int[] array={100,300,200,450,350};
   //     Arrays.sort(array);
    //    System.out.println(Arrays.toString(array));
    //    System.out.println(array[array.length-2]);
    //    System.out.println(array[array.length-1]);
        int largest= array[0];
        int secondlargest=0;
        for (int i=0; i< array.length; i++){
            if(array[i]>largest){
                secondlargest=largest;
                largest=array[i];
            }else if (array[i]>secondlargest&&array[i]!=largest){
                secondlargest=array[i];
            }
        }
        System.out.println("the largest numbers = "+largest+ " and second largest number is = "+ secondlargest);
    }
//Interview question
    //output:
    // The Largest number= 450 and secondsLargest=350


}
