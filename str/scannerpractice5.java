package str;

import java.util.Scanner;

public class scannerpractice5 {
    public static void main(String[] args) {
        //when we use nextline() we can enter multiple words
        // when use next it will not take more than 1 word

        Scanner scanner=new Scanner(System.in);

        String str1=scanner.nextLine();
        // i can provide as many word as i want to
        System.out.println("this is value of string first" +str1);
        String str=scanner.next();
        // i cannot provide more than one word (no spaces)
        System.out.println("this is value of string second" +str);
    }
}
