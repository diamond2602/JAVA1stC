package array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*-ask user, how many names that s/he wants to store in array
-store those names by getting it from user in to array
if the names has 5  or more letters store  it in "longnames" array
if the name has less than 5 letter store  it on "shortnames" array
-print both array by using ->Arrays.toString(); method*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many names you want to store");
        int number=scanner.nextInt();
        String[] longnames=new String[number];
        String[] shortnames=new String[number];
        scanner = new Scanner(System.in);

        for (int i=0; i<number; i++){

            System.out.println("enter " +(i+1) + ". name");
            String name=scanner.nextLine();
            if (name.length()>=5){
                longnames[i]=name;
            }else {
                shortnames[i]=name;
            }


        }
        System.out.println(Arrays.toString(longnames));
        System.out.println(Arrays.toString(shortnames));

    }
}
