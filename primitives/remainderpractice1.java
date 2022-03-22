package primitives;

public class remainderpractice1 {

    public static void main(String[] args) {
        // modulus  --> % --> raminder(leftover after division)
        int number1=45;
        int number2=6;
        int remainder1=number1 % number2;
        System.out.println("remainder1 is >>" +remainder1);

      // find the sum of digits from given number
      // 123 --> 1 + 2 + 3 = 6 --> sout ( sum is >> <sum>)

     //123 %10 --> 3
      // 12% 10 --> 2
      // 1%10 --> 1

        // 123:10=12 12:10=1

        int mynumber=123;
        int digit3=mynumber%10;
        mynumber=mynumber/10;
        int digit2=mynumber%10;
        mynumber=mynumber/10;

        int digit1=mynumber%10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);





    }
}
