package str;

import java.util.Scanner;

public class Stringpractice {
    public static void main(String[] args) {

        //we will ask user to their first name
        //we will ask user to thei last name
        //we wil print firstname in lower case
        //lastname in upper case.
        //.toLowerCase();== makes the all letters lower case
        //.toUppercase();==makes te all letters uppercase

      /*  String str="yusuf";
        str.toUpperCase();
        // if we don't reassing the string
        //it will not change it's value

        System.out.println(str);
        //yusuf

        str=str.toUpperCase();
        System.out.println(str);
        */

        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your firstname");
        String firstname=scanner.next();
        System.out.println("please enter your lastname");
        String lastname=scanner.next();
        System.out.println(firstname.toLowerCase()+lastname.toUpperCase());
        // if i print like this will i change values or
        //none changed
        System.out.println(firstname);


        //if i apply method in print out parenthesis it will

        //print the values with method applied

    }
}
