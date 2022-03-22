package replithomeworkfiles;

import java.util.Scanner;

public class MirrorEdges {
    public static void main(String[] args) {
        /*Given a string, look for a mirror image (backwards) string at
         both the beginning and end of the given string. In other words,
         zero or more characters at the very begining of the given string,
         and at the very end of the string in reverse order (possibly overlapping).

         For example, the string "abXYZba" has the mirror end "ab".
        -> Because ab is in the begining also at the end.

Examples:

Input : abca Output: a

Input : aba Output: aba

Input : eerqwertyree Output: eer
        */
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string value");
        String str=s.nextLine();
        final int half = str.length() / 2;
        int i=0;

        for (int j = str.length()-1; i < half ; i++, j-- ) {
            if (str.charAt(i) != str.charAt(j)) {
                break;
            }
        }

        String mirroredPartOrPalindrome = i < half ? str.substring(0,i) : str;
        System.out.println(mirroredPartOrPalindrome);
    }


    }
