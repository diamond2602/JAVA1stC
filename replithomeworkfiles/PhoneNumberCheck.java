package replithomeworkfiles;

import java.util.Scanner;

public class PhoneNumberCheck {
    /*Write public method named isValidPhone
    in Main.java that takes a string parameter
    as phone number that is separated by hyphens,
    check if the phone number is valid or not? If it is
    valid return true, if it is not return false. Note :
    return type of method is boolean.

Mobile Number validation criteria:
    The first digit should contain number
        between 7 to 9(Including 7 and 9). The rest 9 digit
    can contain any number between 0 to 9.

Example: 773-773-2374 ->
            return true 224-224-2224 -> return false ->
    because first character is not between 7 to 9 773-7777-711 ->
    return false -> because one of hyphens are not in the right place */
  /*  public boolean isValidPhone (String number){
        if (number.length()=11&&number.charAt(0)<=7&&number.charAt(0)>=9&&){
            return true;
        }
    }*/


   /* public static void main(String[] args) {


        // Create method here
        public boolean isValidPhone (String phoneNumber){
            boolean isNumber = false;
            if (phoneNumber.charAt(0) >= '7' && phoneNumber.charAt(0) <= '9'
                    && phoneNumber.charAt(3) == '-' && phoneNumber.charAt(7) == '-' && phoneNumber.length() == 12) {
                for (int i = 0; i < phoneNumber.length(); i++) {
                    if (Character.isDigit(phoneNumber.charAt(i)) || phoneNumber.charAt(i) == '-') {
                        isNumber = true;
                    }
                }
            } else {
                isNumber = false;
            }
            return isNumber;
        }
    }
*/
}

