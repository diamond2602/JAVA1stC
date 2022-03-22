package replithomeworkfiles;


import java.util.Scanner;


public class UpperCaseLowerCase {
    public static void main(String[] args) {
/*Ask user to enter a password

1 - > If the string doesn't have any upper case
letter or any lower case letter print "Your password is not acceptable"

2 - > If the first character of the password is upper case
letter and last character of the password is not letter print "Your password is strong".

3 - > If first character of the password is lower case
letter and last character of the string is upper case print "Your password should be improved"

4 - > For all other conditions print "Your password is not valid"

For this task you should use if else statement.

This is the hardest task in this week's homework and I will send solution for this task on Monday.

Good Luck !
* */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a password");
        String password=scanner.next();
        //
        //Uppercase and lower case method
        //only affect letters in the string
        //Uppercase make all letters Uppercase
        //lowercase make all letters lowercase

        //all leters  are uppercase
        //length  of uppercase and lowercase and password are the same
        String uppercase=password.toUpperCase();
        //all letters are lowercase
        String lowercace=password.toLowerCase();
int lastindexofpassword=password.length()-1;
if (uppercase.equals(password)||lowercace.equals(password)){
    System.out.println("Your password is not acceptable");
}else if(uppercase.charAt(0)==password.charAt(0)&&lowercace.charAt(0)!=password.charAt(0)
        &&uppercase.charAt(lastindexofpassword)==lowercace.charAt(lastindexofpassword)){
    System.out.println("Your password is strong");
}else if(lowercace.charAt(0)==password.charAt(0)&&uppercase.charAt(0)!=password.charAt(0)&&password.charAt(lastindexofpassword)==uppercase.charAt(lastindexofpassword)){
    System.out.println("Your password should be improved");
}else {
    System.out.println("Your password is not valid");}

    }
}
