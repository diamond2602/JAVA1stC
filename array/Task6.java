package array;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String [] colors={"white", "black", "red", "pink", "orange"};
        // print out every element in reverse order from the given array
        //white --> etihw, kcalb,
String [] reveresed =new String[colors.length];

       // String str ="";
        for (int a=0; a< colors.length; a++) {
         String   str="";
            for (int i=colors[a].length()-1; i>=0; i--){

                str+=colors[a].charAt(i);
            }
            reveresed[a]=str;
        }
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(reveresed));



    }
}
