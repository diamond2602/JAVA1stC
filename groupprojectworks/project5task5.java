package groupprojectworks;

import java.util.Scanner;

public class project5task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number between 1 and 10");


        int n = sc.nextInt();
        for (int i=n; i >= 1; i--) {
            for(int j=i; j >= 1; j--) {
                // number
                System.out.print(i);
            }
            // new line
            System.out.println();
        }
    }
}
