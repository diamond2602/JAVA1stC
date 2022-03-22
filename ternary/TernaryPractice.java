package ternary;

import java.util.Locale;

public class TernaryPractice {
    public static void main(String[] args) {
        int a=2, b=3;
        //? :

        String result = a<b ? "hello" : "bye";
        System.out.println(result);
       //String result2= a<b ? a*b : "text"; this will not work because result of ternary
        // both options has to be same data type
        System.out.println(a<b ? a*b :"text");

      // String t= a<b ? System.out.println("hello"):System.out.println("bye"); will not work
boolean result3= a>=b ?a==b: a<b;
        System.out.println(result3);
      int result4='a' > 'Z' ? 5+6+7 : 7-4-1;
        System.out.println(result4);
        String str="David";
        String result5=str.substring(3).equals("id")? str.toLowerCase().concat(" is number") : str.toUpperCase().concat(" is string");
        System.out.println(result5);
        System.out.println(str.equalsIgnoreCase("DAVID")?str.substring(3).toUpperCase():str.substring(3).toLowerCase());


        int n1=2;
        int n2=3;
        int resutl6=n1%2==0?5:6;
    }
}
