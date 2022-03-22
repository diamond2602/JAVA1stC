package replithomeworkfiles;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /* Write a Java program to get an integer number
        from the user and print whether it is positive or negative.

Example Input number: 35 Output: positive Input number: -35 Output: negative*/

        Scanner posneg=new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int userinput=posneg.nextInt();
        if (userinput>0){
            System.out.println("positive number");
        }
        if (userinput<0){
            System.out.println("negative number");
        }

    }
}
