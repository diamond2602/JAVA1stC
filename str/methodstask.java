package str;

import java.util.Scanner;

public class methodstask {
    public static void main(String[] args) {
    //    -Task: get string from user
      //  print first, last, middle, second matching 'c', lenght, index of x
        Scanner somescannername= new Scanner(System.in);
        System.out.println("please enter string");
        String userstr=somescannername.nextLine();
        System.out.println(userstr);
        System.out.println("the first letter is  " +userstr.charAt(0));
        System.out.println("Th last letter is   " +userstr.charAt(userstr.length()-1));
        System.out.println("middle char is  " +userstr.charAt(userstr.length()/2));
        System.out.println("second matching c's index number is  "  + userstr.indexOf("c",userstr.indexOf("c")+1));
        System.out.println("the index of 'x' is "+userstr.indexOf("x"));
        //xyz

    }
}
