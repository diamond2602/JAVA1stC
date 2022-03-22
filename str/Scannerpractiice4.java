package str;


import java.util.Scanner;

public class Scannerpractiice4 {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
      /*  System.out.println("enter an integer number");
        int number=scanner.nextInt();
        // if remiander with 2 gives 0 this will be even
        // otherwise it is odd
        boolean iseven=number%2==0;
        System.out.println(number+ " is even number " +iseven);

//ask user to enter two integer number
        //first interger you provide shloud be bigger than second one
        //if first number bigger than second one we will print out true
        //if second number bigger than  first number
        //we will print out false



        System.out.println("enter your first integer number");
        int firstnumber=scanner.nextInt();
        System.out.println("please enter an integer but smaller than first one");
        int secondnumber=scanner.nextInt();
        boolean isfirstbigger=firstnumber>secondnumber;
        System.out.println(isfirstbigger);
        */

        // to be able to graduate from school
        //student needs
        //85% attendancy
        //70% of homework
        //create a program for teacher
        //teacher will enter all these variables and
        //if student passes you will print true for teacher
        //if student fails you will print false


        System.out.println("enter your student's attendancy");
        int attendance=scanner.nextInt();

        System.out.println("please enter homework");
        int homework=scanner.nextInt();

        System.out.println("enter  grade");
        int grade=scanner.nextInt();
// how can i print for all of them

        boolean isgrade=grade>=80;
        boolean ishomework=homework>=70;
        boolean isattendancy=attendance>=85;
        System.out.println("attendancy is "+isattendancy);
        System.out.println("grade is "+isgrade);
        System.out.println("homework is "+ishomework);
        boolean pass= attendance>=85 && grade>=80 && homework>=70;
        System.out.println(" is student pass " +pass);


    }
}
