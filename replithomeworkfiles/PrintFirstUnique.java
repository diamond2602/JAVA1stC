package replithomeworkfiles;
import java.util.Scanner;
import java.util.Arrays;
public class PrintFirstUnique {
/*Create the array size of 7 and store every
number by asking user in the loop. When asking
user please use the text -> "Enter number for array" .
After having all numbers for array print ONLY the first
unique value from this array. If the array doesn't have
any unique element print the text below
"Array doesn't have any unique element"

EXAMPLE OUTPUT

Enter number for array 1 Enter number for array 2 Enter
 number for array 4 Enter number for array 1 Enter number
 for array 2 Enter number for array 3 Enter number for array
  4 3 -> 3 is printed because array have [1,2,4,1,2,3,4] and
  first unique element from array is 3*/

    public static void main(String[] args) {

        int[] nums = new int[7];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter number for array");
            nums[i] = s.nextInt();
        }
        // finding uniques from array
        // [1,3,4,5,6,9,6,7]
        // When I am looking for a unique element I should check
        // all elements except itself.
        String uniques = "";
        OUTER:
        for (int i = 0; i < nums.length; i++) {
            // nums[i] is unique or not
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j] && i != j) {
                    // numbers[i] is not unique
                    continue OUTER;
                }
            }
            // Whenever code implements this line 23
            // I know that nums[i] is unique
            uniques += nums[i] + " ";


        }
        if (uniques.equals("")) {
            // Array doesn't have any unique element
            System.out.println("Array doesn't have any unique element");
        } else {
            System.out.println(uniques);
        }


    }
}