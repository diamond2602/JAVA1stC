package replithomeworkfiles;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        /*Write a program in Java to display any number in reverse order.  Please look examples below carefully.

Test Data : Input : 12345 (it can be any number like 5 digits or 6 digits etc) Expected Output : 54321

Input : 765432 Expected Output : 234567

Input : 23914 Expected Output : 41932*/

        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int userinput=scanner.nextInt();
        int reversed=0;
        while (userinput!=0) {
            int digit= userinput%10;
            reversed=reversed*10+digit;
            userinput/=10;
        }
        System.out.println("reversed number is " + reversed);

    }
}
