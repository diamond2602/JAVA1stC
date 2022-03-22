package SwitchStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SwitchPractice1 {
    public static void main(String[] args) {
        /*
        get a number from user between 1 to 4 from user
        print out name of season as:
        1-> winter
        2->Spring
        ...
        * */

        Scanner something=new Scanner(System.in);
        System.out.println("please enter a number from 1 to 4"+
                "\n 1-Winter\n 2-Spring\n 3-Summer \n 4-Fall");
        int userinput=something.nextInt();
        switch (userinput){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3 :
                System.out.println("Summer");
                break;
            case 4:
                break;
            default:
                System.out.println(" there is no such season, please enter valid number");
                break;
        }

    }
}
