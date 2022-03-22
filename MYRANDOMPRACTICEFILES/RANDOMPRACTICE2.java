package MYRANDOMPRACTICEFILES;

import java.util.Scanner;

public class RANDOMPRACTICE2 {
    public static void main(String[] args) {
        /*Scanner songname=new Scanner(System.in);
        System.out.println("Enter song name");
        String song=songname.nextLine();
        System.out.println(song.charAt(0));
        System.out.println(song.charAt(song.length()-1));
        System.out.println(song.length());
        System.out.println(song.indexOf("k"));
        System.out.println(song.charAt(3));

        System.out.println(song.toUpperCase());
        System.out.println(song.toLowerCase());
        */

   /*     Scanner random1= new Scanner(System.in);
        System.out.println("Enter a random word");
        String randomword=random1.nextLine();

        System.out.println("Enter number of letter that word consists");
        int totalnumletter=random1.nextInt();

        boolean correctnum=randomword.length()==totalnumletter;
        System.out.println(correctnum);

        System.out.println("Enter a letter that you want to find an index");
String userlet=random1.next();
        System.out.println(randomword.indexOf(userlet));*/

    /*    Scanner words=new Scanner(System.in);
        System.out.println("Enter first string value");
String firstword=words.next();
        System.out.println("Enter second string value");
        String secondword=words.next();
        boolean result=secondword.indexOf(0,1)==firstword.indexOf(-1);
        System.out.println(result);*/
       /* Scanner threewords=new Scanner(System.in);
        System.out.println("Please enter three string values");
        String wordsfromuser=threewords.next();
        char firstc=wordsfromuser.charAt(0);
        String lastc=wordsfromuser.substring(wordsfromuser.length()-1);


        System.out.println(firstc);
        System.out.println(lastc);*/
Scanner values=new Scanner(System.in);

        System.out.println("Please enter a string value");
        String userinput=values.next();

       if (3>userinput.length()){
            System.out.println(userinput);

        }
 if (3<=userinput.length()){
     System.out.println(userinput.substring(1,userinput.length()-1));


 }



    }
}
