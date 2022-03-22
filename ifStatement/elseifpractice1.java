package ifStatement;

import java.util.Scanner;

public class elseifpractice1 {
    public static void main(String[] args) {
        /* get three test results from user and calculate the average of those three tests
        test scores should be in range of 0-100
        based on the avarge score;
        -print out letter grade for this student
        average --> 100-90--> your letter grade is A
        average --> 89-80--> your letter grade is B
        average --> 79-60--> your letter grade is C
        --> less than 60--> you should take the course again
         */

        Scanner grade=new Scanner(System.in);
        System.out.println("please enter test1 grade");
        int userinput=grade.nextInt();
        System.out.println("please enter test2 grade");
        int userinput2= grade.nextInt();
        System.out.println("please enter test3 grade");
        int userinput3=grade.nextInt();

        int average=(userinput+userinput2+userinput3)/3;
        if (average>=90 &&average<=100){
            System.out.println("your grade is A");

        }
        else if (average>=80 &&average<=89) {
            System.out.println("your grade is B");
        }
        else if (average>=60 &&average<=79) {
            System.out.println("your grade is C");
        }
        else{
            System.out.println("you need to take the course again");
        }


    }
}
