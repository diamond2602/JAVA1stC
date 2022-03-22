package replithomeworkfiles;

import java.util.Scanner;

public class BreakInToDigits {
    public static void main(String[] args) {


        // You have already given 5 digit integer number below
        // You should print out individual digits from this variable below.
        // You should not create any other variable named fiveDigitNumber
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter  five digit number");

        int fiveDigitNumber = scanner.nextInt();

        int fifthdigit = fiveDigitNumber % 10;

        int fourdigtnum = fiveDigitNumber / 10;
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

        /* You should create a function in the main class that converts five digit integer in to individual digits.
For example:
Test Data Input five non-negative digits: 54321
Expected output is : 5System.out.println("Please enter a string value");
        String userinput=userenterredstr.next();
        if (userinput.length()%2==0){
            System.out.println(userinput.substring(1));
        }


        if (userinput.length()%2!=0){
            System.out.println(userinput.substring(userinput.length()/2 - 1, userinput.length()/2 + 2));
                     4
                     3
                     2
                     1

Test Data Input five non-negative digits: 45678
       Expected output is : 4
                            5
                            6
                            7
                            8*/


    }

}
