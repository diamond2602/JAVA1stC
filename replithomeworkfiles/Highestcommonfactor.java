package replithomeworkfiles;

import java.util.Scanner;

public class Highestcommonfactor {
    public static void main(String[] args) {
        /*Write a java program to find HCF (Highest Common Factor) of two numbers.
         Test Data : Input 1: 24 Input 2: 28
         Expected Output : 4 -> Because HCF of 24 and 28 is 4 Input 1: 75
         Input 2: 45 Expected Output : 15 -> Because HCF of 75 and 45 is 15

NOTE : Highest Common Factor means biggest common divident of two number.*/
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number 1");
int number1=s.nextInt();
        System.out.println("Enter the number 2");
        int number2=s.nextInt();
      int   hfc=0;
      int i=0;
      for (i=1; i<=number1 || i<=number2; i++){
          if (number1%i==0&& number2%i==0)
              hfc=i;
      }
        System.out.println( "HFC  is " + hfc);
    }

}
