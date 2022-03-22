package str;

public class concat {
    public static void main(String[] args) {

        String test ="Chicago";
        String number="1";
        number+="2";
        number+=2;
        System.out.println(number);// 122 is the outcome
        // String has built methods/functions you can call by using your variable


        test =test.concat(" is the best"); //Chicago is the best
        test =test.concat(" in the summer"); //Chocago is the best in the summer

        System.out.println(test);

        test += test.concat(" EVER");
        System.out.println(test); // Chicago is the best in the summerChicago is the best in the summer EVER







    }
}
