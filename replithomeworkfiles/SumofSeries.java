package replithomeworkfiles;

import java.util.Scanner;

public class SumofSeries {
    public static void main(String[] args) {
        /*
        Write a program in Java to find the sum of the series
        1 +11 + 111 + 1111 + .. n terms.  Here the number n will come from
         user so if user gives number 3 you should find sum of 1 + 11 + 111.
         Please look carefully example below.

          Test Data : Input the number of terms : 5
         Expected Output : 12345 (Because the sum of 1 + 11 + 111 + 1111 + 11111= 12345)
        */
        System.out.println("Enter the number of term");
        // The rule of the series is multiply by 10 and add1
        Scanner s = new Scanner(System.in);
        int term=s.nextInt();
        int numbersinseries= 0;
        int sumOfthenumber=0;
        for (;term>0; term--) {
         numbersinseries=numbersinseries*10+1;
          sumOfthenumber+=numbersinseries;
        }
        System.out.println(sumOfthenumber);

    }
}
