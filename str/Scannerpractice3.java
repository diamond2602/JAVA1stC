package str;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Scannerpractice3 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.nextLine();
        System.out.println("please enter your birth year");
        int birthyear=scanner.nextInt();
        int age=2021-birthyear;
        System.out.println(name + " you are " +age+ " years old");

        int currentyear= LocalDateTime.now().getYear();
        System.out.println(currentyear);
        int currentime=LocalDateTime.now().getMinute();
        System.out.println(currentime);


    }
}
