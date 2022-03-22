package loops.while_doWhile;

import java.util.Scanner;

public class whilepractice5 {
    public static void main(String[] args) {
        //get a string from user and print out every letter from given string separated by comma
        //input ==> winter
        // out --> w, i, n, t, e, r,

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter String");
        String input=scanner.nextLine();
        int i = 0;
       while ( i < input.length()) {
            System.out.print(input.charAt(i) + ", ");
            i++;
        }
       // print those letters in reverse order
        System.out.println();
int lastindex=input.length()-1;
       while (lastindex>=0){
           System.out.print(input.charAt(lastindex)+ ", ");
           lastindex--;
       }

    }
}
