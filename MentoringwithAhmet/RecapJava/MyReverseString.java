package MentoringwithAhmet.RecapJava;

import java.util.Scanner;

public class MyReverseString {
    public static void main(String[] args){



        String str= "xof nworb kciuq ehT";          // REVERSING THE GIVEN STRING
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse +str.charAt(i);
        }
        System.out.println(reverse);
        //=========================================

        Scanner scan = new Scanner(System.in);    // REVERSING USER'S INPUT
        System.out.println("enter a string");
        String str1 = scan.nextLine();
        String reverse1 = "";
        for (int i = str1.length()-1; i>=0; i--){

            reverse1= reverse1 + str1.charAt(i);

            //   System.out.println(reverse1);

        }

        System.out.println(reverse1);


    }
}
