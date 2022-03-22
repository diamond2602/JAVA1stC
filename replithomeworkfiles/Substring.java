package replithomeworkfiles;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        /*Using the scanner ask the user to enter one String value.
    If the string length is bigger than or equals to 3 print the string without first and last char.
     If the length is not bigger than 3 print as it is. (for this task you need to use if statement).
     Example 1: Please enter the String value:
    test The output is: es Example 2: Please enter the String value: Hello The output is: ell*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String userinput=scanner.next();
        if (userinput.length()>=3){
            System.out.println(userinput.substring(1,userinput.length()-1));
        }else  if (userinput.length()<3){
            System.out.println(userinput);
        }
    }
}
