package replithomeworkfiles;

import java.util.Scanner;

public class SumOf1dividedN {
    public static void main(String[] args) {
        /*Write a program to calculate the sum of following
        series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n Please just print out the result.

Please look at the examples below carefully EXAMPLES Input
: 2 Output : 1.5 -> Because 1+1/2 =1.5

Input : 4 Output: 2.083333333333333 -> Because 1+1/2+/1/3+1/4 = 2.083333333333333*/
        System.out.println("Enter number of terms of series :");
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        double i;
        double sum=0;
        for(i=1;i<=num;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println(sum);
    }
}