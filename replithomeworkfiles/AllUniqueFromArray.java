package replithomeworkfiles;

import java.util.Scanner;

public class AllUniqueFromArray {
    public static void main(String[] args) {
        /*Create the int array size of 13 and store every
         number by asking user in the loop. When asking user
         please use the text -> "Enter number for array" .
         After having all numbers for array print ALL unique
         values from this array. If the array doesn't have any
         unique element print the text below "Array doesn't have any unique element"

EXAMPLE OUTPUT: Enter number for array 5 Enter number for array
 6 Enter number for array 4 Enter number for array 5 Enter number
  for array 6 Enter number for array 7 Enter number for array 9
  Enter number for array 0 Enter number for array 0 Enter number
   for array 0 Enter number for array 0 Enter number for array 0
   Enter number for array 0 4 7 9 ->
   Since the array is [5,6,4,5,6,7,9,0,0,0,0,0,0] only unique numbers are 4 7 9

NOTE: When you print unique numbers put space between them*/
        Scanner input = new Scanner(System.in);// User input

        System.out.println("Enter number for array");

        int array[] = new int[13]; // Intilized array of size 13

        for (int i = 0; i < 13; i++) // used for loop for user input

        {
            array[i] = input.nextInt(); // Assigned users value to array
            System.out.println("Enter number for array");
        }


        for (int j = 0; j < array.length; j++) {
            int count1 = 0; // to find out how many time value is appeared in the arry
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[j]) {
                    // if(arr[i] == 1 ) { first it was like this when the second for came, it was the one on the left
                    count1++; // to count the letters in the array one by one
                }
            }
            if (count1 == 1) {
                System.out.print(array[j] + " ");// 6 7 8 uniqe
            }
        }
        System.out.println("Array doesn't have any unique element");

    }
}
