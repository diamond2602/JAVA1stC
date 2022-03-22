package replithomeworkfiles;

import java.util.Scanner;

public class BlueOrRed {
    public static void main(String[] args) {

/*Using the scanner ask the user to enter any String value.
If this String has a color like red or blue with lower case print the red or blue.
 Other wise do not print anything.
 EXAMPLE-1: Input: "xxredyy" Output: red EXAMPLE-2: Input: "xbxltue" Output: blue
*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a string value");
        String value = scr.nextLine();
        if (value.contains("r") && value.contains("e") && value.contains("d")){
            System.out.println("red");
        }else if(value.contains("b") && value.contains("l") && value.contains("u") && value.contains("e")){
            System.out.println("blue");
        }



/*public class BlueOrRed {
    // string.contains("blue")
    // individual letters
    // b.dsklbue
    // I have to use index of method
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String str = scanner.next().toLowerCase();
    if (str.contains("b")&&str.contains("l")&&str.contains("u")&&str.contains("e")){
        int indexB = str.indexOf("b");// 1
        int indexL = str.indexOf("l",indexB);// 0
        int indexU  =str.indexOf("u",indexL);
        int indexE = str.indexOf("e",indexU);
        // I have to look index of l after b
        //lblube
        if (indexB<indexL&&indexL<indexU&&indexU<indexE){
            System.out.println("blue");
        }
    }

}}
//    Using the scanner ask the user to enter any String value. If this
//        String has a color like red or blue with lower case print the red or
//        blue. Other wise do not print anything.
//        But in the words b has to come first then the other letters
//        EXAMPLE-1:
//        Input: "xxderyy"
//        Output: red
//        EXAMPLE-2:
//        Input: "xbxltue"
//        Output: blue*/




    }
}
