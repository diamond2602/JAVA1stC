package replithomeworkfiles;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        /*Please find the LCM(least common multiple) of two given integers.

NOTE: The LCM of two integers is the smallest positive integer
that is perfectly divisible by both the numbers (without a remainder).
Please look at example carefully. EXAMPLES: Input 1: 72 Input 2: 120 Output : 360

Input 1: 24 Input 2: 60 Output : 120
      */
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number 1");
int number1=s.nextInt();
        System.out.println("Enter the number 2");
        int number2=s.nextInt();
        int hfm=1;
        for (int i=1; i<=number1 && i<=number2; ++i) {
            if (number1%i==0 && number2%i==0)
                hfm=i;
        }
        int lcm=(number1*number2)/hfm;
        System.out.println(lcm);
    }
}
