package replithomeworkfiles;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
       /* Using the scanner ask the user to enter a String value and if both string length
        is same concatenate them together then print the result. If both String
        length is not same then omit last chars from the longer string so it is the same
        length as the shorter string. After making both strings the same length then
        concatenate them and print the result.
        NOTE:!!!!! Please use scanner next() method and do not use nextLine() for this task.!!!!!!!!!!!!
                EXAMPLE-1:
        String 1: "Cell"
        String 2: "Phone"
        Output: "CellPhon"
        EXAMPLE-2:
        String 1: "Cable"
        String 2: "Mic"
        Output: "CabMic"*/
        Scanner concat=new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1= concat.nextLine();

        System.out.println("Enter string 2");
        String str2= concat.nextLine();
      if (str1.length()==str2.length()){
    System.out.println(str1+str2);
      }
        if (str1.length()<str2.length()){
int difference=str2.length()-str1.length();

            int substractionresult=str2.length()-difference;
          

            System.out.println(str1+str2.substring(0,substractionresult));


        }
        if (str1.length()>str2.length()) {
            int difference = str1.length() - str2.length();

            int substractionresult = str1.length() - difference;


            System.out.println(str1.substring(0, substractionresult)+str2);



        }


           /* int difference=str2.length()-str1.length();
            String converted=Integer.toString(difference);
            String diffrenceresult=str2.length()-converted;
            System.out.println(diffrenceresult+str1);*/


    }
}
