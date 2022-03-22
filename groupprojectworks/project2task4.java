package groupprojectworks;

import java.util.Scanner;

public class project2task4 {
    public static void main(String[] args) {
        //task4project2

      /*  1. write a program that will accept only 6 digit numbers like 578432 and find multiplication
(5*7*8*4*3*2) of all digits and sum
      (5+7+8+4+3+2) of all digits
      examples1:
      578432
      multiplication of all digits 6720
      the sum of all digits 29
       */

        Scanner userinput = new Scanner(System.in);
        System.out.println("Please enter 6 digit number");
        int sixdigitnumber = userinput.nextInt();
        String num = Integer.toString(sixdigitnumber);
        if (num.length()==6) {



            int sixthdigit = sixdigitnumber % 10;

            int fivedigitnum = sixdigitnumber / 10;
            int fifthdigit = fivedigitnum % 10;

            int fourdigtnum = fivedigitnum / 10;
            int fourthdigit = fourdigtnum % 10;
            int threedigitnum = fourdigtnum / 10;
            int thirddigit = threedigitnum % 10;
            int twodigitnum = threedigitnum / 10;
            int seconddigit = twodigitnum % 10;
            int firstdigit = twodigitnum / 10;

            System.out.println(firstdigit);
            System.out.println(seconddigit);
            System.out.println(thirddigit);
            System.out.println(fourthdigit);
            System.out.println(fifthdigit);
            System.out.println(sixthdigit);

            int multiplication = firstdigit * seconddigit * thirddigit * fourthdigit * fifthdigit * sixthdigit;
            System.out.println("total from multiplication is =  " + multiplication);
            int sum = firstdigit + seconddigit + thirddigit + fourthdigit + fifthdigit + sixthdigit;
            System.out.println("total from adding number is =  " + sum);
        }
        else {
            System.out.println("this is not a 6 digit number");}
    }
}
