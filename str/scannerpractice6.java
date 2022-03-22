package str;

import java.util.Scanner;

public class scannerpractice6 {
    public static void main(String[] args) {
        Scanner davidsbank=new Scanner(System.in);
        System.out.println("How much is Deposit amount?");
        double balance=200;
        double firscheck=davidsbank.nextDouble();
        balance +=firscheck;

        System.out.println("How much is Deposit amount?");
        double secondcheck=davidsbank.nextDouble();
        balance +=secondcheck;

        System.out.println("How much is Deposit amount?");
        double thirdcheck=davidsbank.nextDouble();
        balance +=thirdcheck;

        System.out.println("how much is the phone? please enter the amount");
        double phone$=davidsbank.nextDouble();
        balance -=phone$;

        System.out.println("how much is the headphone? please enter the amount");
        double headphone$=davidsbank.nextDouble();
        balance -= headphone$;

        System.out.println("your final balance is " + balance);



    }
}
