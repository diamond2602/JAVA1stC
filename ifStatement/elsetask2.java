package ifStatement;

import java.util.Scanner;

public class elsetask2 {
    public static void main(String[] args) {
        // find out if your zip code even number or odd number

        Scanner zipcode=new Scanner(System.in);
        System.out.println("please enter zipcode");

        int userinput=zipcode.nextInt();
        if (userinput%2==0){
            System.out.println("your zipcode is even number");
        }
        else {
            System.out.println("your zipcode is odd number");
        }
    }
}
