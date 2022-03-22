package groupprojectworks;

import java.util.Scanner;

public class project5task6uniqueletters {
    public static void main(String[] args) {
        // find unique letter
        // example i am happy --i am hpy
        System.out.println( "please enter a sentence");
        Scanner sc=new Scanner(System.in);
        String userinput= sc.nextLine();
        String temp = "";
        for (int i = 0; i < userinput.length(); i++){
            if (temp.indexOf(userinput.charAt(i)) == - 1){
                temp = temp + userinput.charAt(i);
            }
        }System.out.println(temp.trim());




    }
}
