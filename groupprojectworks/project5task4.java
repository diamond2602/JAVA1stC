package groupprojectworks;

import java.util.Scanner;

public class project5task4 {
    public static void main(String[] args) {
        //same numbers in line but increasing on next line pyramid
       Scanner sc = new Scanner(System.in);
        System.out.println("please enter number between 1 and 10");


        int line = sc.nextInt();
        for(int i=1; i<=line; i++){
            for(int j=1; j<=i; j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
