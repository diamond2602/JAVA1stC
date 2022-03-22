package ifStatement;

import java.util.Locale;
import java.util.Scanner;

public class ifpractice3 {
    public static void main(String[] args) {


        //ask user to enter single word
        //if the word's first metter is M--> ther is a day starts with M>>monday
        //T- T>>Tuesday/Thursday
        //W-  W wednseday
        //F-- friday
        //S  -- saturday/sunday
        Scanner words = new Scanner(System.in);
        System.out.println("please enter a word");
        String userinput = words.next().toUpperCase();

        if (userinput.startsWith("M")){
            System.out.println("Monday");
        }
        if(userinput.startsWith("T")){
            System.out.println("Tuesday/Thursday");

        }
        if (userinput.startsWith("W")){
            System.out.println("Wednesday");

        }
        if (userinput.startsWith("F")){
            System.out.println("Friday");

        }
        if (userinput.charAt(0)=='S'){
            System.out.println("Saturday/sunday");
        }
        if (!userinput.startsWith("M")&&!userinput.startsWith("T")&&
                !userinput.startsWith("W")&&!userinput.startsWith("F")&&!userinput.startsWith("S")){
            System.out.println("there is no day!!");
        }
    }
}
