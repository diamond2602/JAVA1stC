package str;

import java.util.Scanner;

public class Scannerpractice {
    public static void main(String[] args) {

        String name="Almaz";

        System.out.println("My name is  " +name);

        // creating  Scanner object
        Scanner input= new Scanner(System.in);

        System.out.println("please enter your lastname ");
        String lastname=input.nextLine();
        System.out.println(lastname);

    // Task: ask user to enter hi/her city name and print as: "name><lastname> you are living in <city>





        System.out.println("Please enter your city name ");
        String city=input.nextLine();
        System.out.println(name + " "+ lastname+ " you are living in " + city);


        lastname="xxxxx";
        System.out.println(lastname);

        System.out.println("please enter your age");
        int age=input.nextInt();
        System.out.println(name +" your age is very good age. that is >> " +age);
        System.out.println("please enter you height in feet and inches(i.e. 5.8)");
           double height=input.nextDouble();
        System.out.println("your height is " + height);

        System.out.println("please enter your address ");
        //input.nextline(); another option to reassign/fix the issue  input= new Scanner(System.in);
        input= new Scanner(System.in);
        String address= input.nextLine();
        System.out.println("is this correct address you provided? " +address);
    }
}
