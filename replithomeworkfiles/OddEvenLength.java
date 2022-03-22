package replithomeworkfiles;

import java.util.Scanner;

public class OddEvenLength {
    public static void main(String[] args) {
        /*Using scanner ask user to enter one string value.
        If this string length is odd number print middle 3 string from given value.
        If the string length is even number print string without first letter.
        (You need to use if statement for this task) Example
        1: Please enter the String value: test The output is: est

        Example 2: Please enter the String value: Chicago The output is: ica*/

        Scanner userenterredstr=new Scanner(System.in);
        System.out.println("Please enter a string value");
        String userinput=userenterredstr.next();
        if (userinput.length()%2==0){
            System.out.println(userinput.substring(1));
        }


        if (userinput.length()%2!=0){
            System.out.println(userinput.substring(userinput.length()/2 - 1, userinput.length()/2 + 2));
        }

    }
}
