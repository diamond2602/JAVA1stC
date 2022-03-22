package array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int [] studentids=new int[5];
        // type of integer array
        //array has indexing
        studentids[0]=21;
        studentids[1]=31;
        studentids[2]=41;
       //studentids[3]=51;
     //  studentids[4]=61;
     // System.out.println(studentids); // it will print out memory location for the array--> hash code --> [I@1b6d3586
        System.out.println(studentids[0]);
        System.out.println(studentids[1]); //31
        System.out.println(studentids[2]);
        System.out.println(studentids[3]);

        studentids[1]=99;
        System.out.println(studentids[1]);
      //  studentids[5]=51;// index 5 out of bounds for length 5
      // System.out.println(studentids[5]); //index 5 out of bounds for length 5
        System.out.println("========");
        for (int i=0; i<studentids.length; i++){
            System.out.println(studentids[i]);
        }
        System.out.println("======");
        System.out.println(Arrays.toString(studentids)); //it will print out all elements as array from array

    }
}
