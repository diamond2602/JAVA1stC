package SwitchStatement;

import java.util.Locale;
import java.util.Scanner;

public class SwitchPractice2 {
    public static void main(String[] args) {
        /*==Task:==
Ask user for his/her favorite fruit
-you have: mango, banana, kiwi, orange, apple, grape
if you have user's favorite fruit, --> We have your favorite fruit in our store
-orher wise: Sorry, we don't have your favorite fruit :( :*/
        Scanner store=new Scanner(System.in);
        System.out.println("please enter your favorite fruit");
        String fruits=store.nextLine();
        switch (fruits.toLowerCase()){
            case "banana":
                System.out.println("we have your fruit");
                        break;
            case "kiwi":
                System.out.println("we have your fruit");
                break;
            case "mango":
                System.out.println("we have your fruit");
                break;
            case "grape":
                System.out.println("we have your fruit");
                break;
            default:
                System.out.println("we don't have your favorite fruit");
                break;

        }
    }
}
