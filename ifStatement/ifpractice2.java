package ifStatement;

import java.util.Scanner;

public class ifpractice2 {
    public static void main(String[] args) {
        //assume that user is using military style time 1 -24
        // print out good morning/ good afternoon
        //for teh hours of morning or afternoon
        // ask user to enter only hours for the date
        //if the hour less than 12 print good morning
        //if the hour more than 12 less than 18 print good afternoon
        // if the hour more than 18 print good evening
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter hour between 1-23");
        int hour=sc.nextInt();
        if (hour<12 && hour>=0){
            System.out.println("good morning");
        }
        if (hour>=12 && hour < 18){
            System.out.println("good afternoon");}
            if (hour>=18 && hour<24 ){
                System.out.println("good evening");}
            if (hour <0 || hour >23){
                System.out.println("check your time");
            }


    }
}

