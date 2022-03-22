package replithomeworkfiles;

import java.util.Scanner;

public class Replacewitha {
    public static void main(String[] args) {
        /*Using the scanner ask the user to provide String value.
        Then replace all the char of the String with 'a' using loop and PRINT IN EVERY STEP.
         Look at example below carefully For example:
         Input: Success Output: "auccess" "aaccess" “aaacess”
         "aaaaess" "aaaaass" "aaaaaas" "aaaaaaa" “aaaaaaa”*/

        //At he end I have to have length of String times a

        System.out.println("Enter a string value");
        Scanner s=new Scanner(System.in);
        String str=s.next();

        // how can I remove certain part of the string ?
        //substring
       String a="a";
       for(int i=1; i<=str.length(); i++) {
          System.out.println(a+str.substring(i));
          a+="a";
        }



    }
}
