package ternary;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int a=3, b=5, k=7;
        //increments ++/decrements --
      int r1 =  a >=k ? a+ k++: ++b +k;
        System.out.println(r1);
        System.out.println(b);
        System.out.println(k);

             //   7<7   ill not count ++k from 1 st site because it false         6  * 2-1
        int r2= k<++b ? 2* ++k -2 : --k * 2 -1;
        System.out.println(r2);

                         //  6 7
        System.out.println(k>=b? "i got this":false);
        System.out.println("test".equals("test")? "TEST".toLowerCase():99);
      //  String x="test".equals("test")? "TEST".toLowerCase():99; will not work


    }
}
