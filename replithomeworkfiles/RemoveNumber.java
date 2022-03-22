package replithomeworkfiles;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveNumber {

    /*Create the int array with numbers following,
    10,4,3,55,32,145,443,234,98,32 . Then, using scanner
    ask user to provide any number from given array, then remove
     the value from array and put 0 instead of that number
     and PRINT the array. If array doesn't contain the number PRINT "false".

Example: Given Number: 145 Output: [10, 4, 3, 55, 32, 0, 443, 234, 98, 32]

Example 2: Given Number: 2000 Output: false

Example 2: Given Number: 32 Output: [10, 4, 3, 55, 0, 145, 443, 234, 98, 0]*/




        public static void main(String[] args) {
            System.out.println("Please enter number from array");
            int[] nums = {10, 4, 3, 55, 32, 145, 443, 234, 98, 32};
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (num == nums[i]) {
                    nums[i] = 0;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("false");
            } else {
                System.out.println(Arrays.toString(nums));
            }
        }
}
