package loops.while_doWhile;

import java.util.Scanner;

public class whilepractice3 {
    public static void main(String[] args) {

        //task
        //ask user to enter an integer value and find th divisors of the given number
        //10-1,2,5,10
        //15-->1,3,5,15
        //print out --> ... is divisor of ...
        Scanner scanner=new Scanner(System.in);
        System.out.println("please a positive  whole number");
        int inputnumber=scanner.nextInt();
        int divisor=1;
        while (divisor<=inputnumber){
           if ( inputnumber%divisor==0){
               System.out.println(divisor+ " is divisor of " +inputnumber);

           }
           divisor++;
        }


    }
}
