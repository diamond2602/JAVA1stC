package replithomeworkfiles;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*Write a Java program to check whether a given number is an armstrong number or not.  NOTE: An Armstrong number, also known as narcissistic number, is a number that is equal to the sum of the cubes of its own digits. For example, 370 is an Armstrong number since 370 = 333 + 777 + 000 Look at example below carefully.

Test Data : Input a number: 153 Expected Output :153 is an Armstrong number

Input a number: 230 Expected Output : 230 is not an Armstrong number*/
        System.out.println("Enter a number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int copyofthenumvalue=num;
        // I need to find every digit of this number and sum of cubes of those digits
        // we need to find all digits
        //remainder with 10 num% 10 -> last digit of the number
        // dividing the number by 10 will remove the last digit of the number
        // when the result of division is 0 we need to stop
        int sum =0;
        for (;num>0 ;num=num/10) {
            int digit = num % 10;
            // cube of th digit
            int cubeofdigit = digit * digit * digit;
            sum += cubeofdigit;
        }
        if (sum==copyofthenumvalue){
            System.out.println(copyofthenumvalue+ " is an Armstrong number");

        }else {
            System.out.println(copyofthenumvalue+" is not an Armstrong number");
        }
    }
}