package replithomeworkfiles;

import java.util.Scanner;

public class LoopMultiplicationTable {
    /*Using Scanner ask user to provide any int number and
    print multiplication table of given number
    Please make sure your output exactly look like given example below. EXAMPLE:

Input number: 5 Output : 5 1 = 5 5 2 = 10 5 3 = 15 5
4 = 20 5 5 = 25 5 6 = 30 5 7 = 35 5 8 = 40 5 9 = 45 5 10 = 50*/

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int userinput=scanner.nextInt();
        int a=1;
        while (a<=10){
            System.out.println(userinput + "*" +a+" = " +(userinput*a));
            a++;
        }

    }
}
