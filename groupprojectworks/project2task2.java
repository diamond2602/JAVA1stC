package groupprojectworks;

import java.util.Scanner;

public class project2task2 {
    public static void main(String[] args) {
        Scanner money=new Scanner(System.in);
        System.out.println("please enter how many quarters");
        int quarters=money.nextInt();
        System.out.println("please enter how many dimes");
        int dimes=money.nextInt();
        System.out.println("please enter how many nickels");
        int nickels=money.nextInt();
        System.out.println("please enter how many pennies");
        int pennies=money.nextInt();
        double quartertotal=quarters*25;
        double dimestotal=dimes*10;
        double nicketotal=nickels*5;
        double penniestotal=pennies*1;
        double total=(quartertotal+dimestotal+nicketotal+penniestotal)/100;
        System.out.println("The total in dollars is  " + total);

    }
}
