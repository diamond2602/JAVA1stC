package ifStatement;

import java.util.Scanner;

public class elsetask1 {
    public static void main(String[] args) {
        /*==Task===
                when your order total is more than $1000 you get %20 discount, other wise you get %5 discount
        calculate and print total discount and payment in each case */

        Scanner userinput  =new Scanner(System.in);
        System.out.println("plese enter order amount");
      double total=userinput.nextDouble();
      if (total>=1000){
          System.out.println("dsicount is " +total*0.20);
          System.out.println("your payment after disocunt = " + (total- (total*0.2)));
      }
else {
          System.out.println("discount is  " +total*0.05 );
          System.out.println("your payment after discount is = "+ (total- (total*0.05)));
      }
    }
}
