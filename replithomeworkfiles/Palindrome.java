package replithomeworkfiles;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*Write a program in Java to check whether a String is a palindrome or not. If string is a palindrome print "palindrome" if not print "not palindrome" NOTE: A string is said to be a palindrome if the string read from left to right is equal to the string read from right to left. For example, ignoring the difference between uppercase and lowercase letters, the string "iTopiNonAvevanoNipoti" is a palindrome,

Test Data : Input a number: Civic Expected Output : palindrome

Input : Java Expected Output: not palindrome

Input: Hannah Expected Output : palindrome

Input : Try Expected Output : not palindrome
        */
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");

        }
    }

}
