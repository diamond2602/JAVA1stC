package str;

import java.util.Scanner;

public class taskclassmethods {
    public static void main(String[] args) {
        Scanner personalinfo=new Scanner(System.in);

/*by using scanner ask user to provide his/her gender, full name and birth year in the following format
    F - Jenny Brown - 1999
-check if the string starts with F
-check if the string ends with M
-check if the string contains your name
-check if the string ending with birth year
-replace '-' with '/' */



        System.out.println("please enter your gender, full name and birth year in " + "the following format: F - Jenny Brown - 1999" );
        String info=personalinfo.nextLine();
        System.out.println(info.startsWith("F"));
        System.out.println(info.endsWith("M"));
        System.out.println(info.contains("Efe"));
        System.out.println(info.endsWith("2000"));
        System.out.println(info.replace('-','/'));


    }
}
