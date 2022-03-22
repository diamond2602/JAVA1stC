package primitives;

import java.util.Scanner;

public class charpractise {
    public static void main(String[] args){
        /* char ch1= 'A';
        System.out.println(ch1);
        System.out.println("A");
        System.out.println('A');

        ch1='5'; // re-assigment  --> from ascii 5 is decimal of 53
        System.out.println(ch1);
        System.out.println(ch1*2);
        char ch2=ch1;
        System.out.println(ch2);

        char ch3='&';
        System.out.println(ch3);

        char ch4=80; // P
        System.out.println(ch4);
     // char ch5='ye' you can not assign more than one character in a single quotation mark

        int numberchar= 'T';
        System.out.println(numberchar);

        char randomchar=2345;
        System.out.println(randomchar); */

        String device= "microphone";
        char ch=device.charAt(0);
        System.out.println(ch);


        char ch1=device.charAt(4);
        System.out.println(ch1);

        System.out.println(device.charAt(9));

        Scanner somescannername= new Scanner(System.in);
        System.out.println("please enter a word" );
        String word= somescannername.next();
        System.out.println("this is your first letter of the String---> " +word.charAt(0));
        System.out.println("please enter another word");

        //without storing incoming string value, taking a letter from it and print
        System.out.println(somescannername.next().charAt(0));

    }
}
