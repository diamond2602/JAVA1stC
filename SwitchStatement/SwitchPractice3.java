package SwitchStatement;

import java.util.Scanner;

public class SwitchPractice3 {
    public static void main(String[] args) {
        /*
         ask user for name of geometrical shape
         based on the name of the shape calculate the area of that shape
         and get length and width height of those shapes from user to use
         them in calculations print out name of the shape area of that shape
         -triangle,  l*w
          -rectangle   (base * height)/2
         */
Scanner gemotery=new Scanner(System.in);
        System.out.println("please enter geometrical shape");
        String  userinput= gemotery.nextLine().toLowerCase();




        switch (userinput){
            case "triangle" :

                System.out.println("please enter height of triangle");
                double h= gemotery.nextInt();
                System.out.println("please enter base of triangle");
                double b= gemotery.nextInt();
                System.out.println("the area of triangle is " + ((b*h)/2));
                break;
            case "rectangle":
                System.out.println("please enter length of rectangle");
                double l= gemotery.nextInt();
                System.out.println("please enter width of rectangle");
                double w= gemotery.nextInt();
                System.out.println("the area of rectangle is " + (w*l));
                break;
            default:
                System.out.println("wrong geometrical shape");

        }
    }
}
