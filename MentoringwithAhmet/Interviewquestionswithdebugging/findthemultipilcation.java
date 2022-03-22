package MentoringwithAhmet.Interviewquestionswithdebugging;

import java.util.Scanner;

public class findthemultipilcation {
    public static void main(String[] args) {
        // write a program that will acept numbers like 578432
        //get the multiplication of the number 5*7*8*4*3*2 -->6720
        //get  teh sum of them number 5+7+8+4+3+2  -->29
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int number=scan.nextInt();
        int sumofmultiplication=1;
        while (number!=0){
            int digit=number%10;
            number=number/10;
            sumofmultiplication=digit*sumofmultiplication;



        }System.out.println(sumofmultiplication);

    }

}
