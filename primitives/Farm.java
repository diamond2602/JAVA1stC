package primitives;

public class Farm {

    public static void main(String[] args) {

        /* in a farm there are 12 cows and 23 chickens
        1- find the total legs of the animals in the farm and print out
        2- if each cow costs $ 2345 dn each chicken costs $ 23.99
        find the total worth of these animals and print out.
         */


         int cowcount=12;
          int chickencount=23;

        int totalleg=(chickencount*2)+ (cowcount*4);
          double  cowprice=2345;
          double chickenprice=23.99;
          double total$= cowcount*cowprice+chickencount*chickenprice;
        System.out.println("total worth of animals -->" +total$);
        System.out.println(cowcount*cowprice+chickencount*chickenprice);
        System.out.println(totalleg);
    }
}
