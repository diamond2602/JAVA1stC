package replithomeworkfiles;

import java.util.Scanner;

public class FindingDad {
    public static void main(String[] args) {
        /*Using scanner ask user to provide the string value.
        Print "dad" if the given string contains the "dad",
        but where the middle 'a' char can be any char otherwise please do not print anything.
         Please look carefully examples below.
         Example: Input the year: testdadtest Output :dad Input the year:
         testd7dtest Output :dad Input the year: testdodtest
         Output :dad Input the year: testDudtest Output :dad
         d6d first  d's inded is x seconds is x+2*/

        System.out.println("Enter a string value");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // str.charAt(); to be able to use char at method we need and index number
        int i = 0; //represents index number
        // does index number has to be always smaller than length?
        //yes
        // what is the biggest number i used in the loop
        //i+2
        //always use condition
        //biuggestindexnumberyouusedin loop<lengthofString
        while (i +2< str.length()) {
            if (str.charAt(i) == 'd' && str.charAt(i + 2) == 'd') {
                System.out.println("dad");
                break;
            }
i++;

        }
    }
}
        //another task
        /*     Scanner sc = new Scanner (System.in);
                System.out.println("Enter a starting number");
                int stNumber=sc.nextInt();
                System.out.println("Enter an ending number");
                int endNumber=sc.nextInt();
                int divisor1=3;
                int divisor2=5;
                int result=0;

                while (stNumber<=endNumber){
                    if (stNumber%divisor1==0 && stNumber%divisor2==0){
                        result++;}
                }
                stNumber++;
        System.out.println(result);
            }*/