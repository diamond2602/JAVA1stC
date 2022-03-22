package replithomeworkfiles;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {


    /*Using scanner ask user to enter grade letter and print the
     number value matcing with this grade.
     Example: Input : A Output: 4.0 Input: A- Output: 3.7
     NOTE: The University uses a 4 point scale for grades;
     these “quality” grades are as follows
     4.0 = A, 3.7 = A-, 3.3 = B+, 3.0 = B, 2.7 = B-, 2.3 = C+, 2.0 = C, 1.7 = C-, 1.3 = D+, 1.0 = D, F = 0.0*/
        System.out.println("Please enter your grade in letter.");
        Scanner gradeletter=new Scanner(System.in);
        String userinput=gradeletter.next();
        if (userinput.equalsIgnoreCase("A")){
            System.out.println("4.0");
        }
        if (userinput.equalsIgnoreCase("A-")){
            System.out.println("3.7");
        }
        if (userinput.equalsIgnoreCase("B+")){
            System.out.println("3.3");
        }
        if (userinput.equalsIgnoreCase("B")){
            System.out.println("3.0");
        }
        if (userinput.equalsIgnoreCase("B-")){
            System.out.println("2.7");
        }
        if (userinput.equalsIgnoreCase("C+")){
            System.out.println("2.3");
        }
        if (userinput.equalsIgnoreCase("C")){
            System.out.println("2.0");
        }
        if (userinput.equalsIgnoreCase("C-")){
            System.out.println("1.7");
        }
        if (userinput.equalsIgnoreCase("D-")){
            System.out.println("1.3");
        }
        if (userinput.equalsIgnoreCase("D")){
            System.out.println("1.0");
        }
        if (userinput.equalsIgnoreCase("F")){
            System.out.println("0.0");
        }

 }
}
