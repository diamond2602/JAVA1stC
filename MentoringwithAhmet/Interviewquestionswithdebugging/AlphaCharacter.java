package MentoringwithAhmet.Interviewquestionswithdebugging;

public class AlphaCharacter {
    // print out alphabetical, digit nad special characters from
    // the string separately
    // String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
    //1print out alphacharacter
    //2- print out digit
    //3-print out special character
    public static void main(String[] args) {
        // what am i supposed to do in here
        // we have a tring and you are supposed to separate the chcharacters from
        // each other
        //how can i solve this problem
        //how you can reach out the characters one by one
        // i can use for loop
        // then go ahead
        // how can i identify this character is alphabetic, digit or special
        // you can either go with character. is alphabetical or isdigit method
        // or you can go with 'a' to 'z'
        String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String onlyAlphabetical = "";
        String onlydigit = "";
        String onlyspecial = "";
        for (int i = 0; i < given.length(); i++) {
            if (Character.isAlphabetic(given.charAt(i))) {
                onlyAlphabetical += given.charAt(i);
            } else if (Character.isDigit(given.charAt(i))) {
                onlydigit += given.charAt(i);
            } else {
                onlyspecial += given.charAt(i);
            }
        }
        System.out.println(onlyAlphabetical);
        System.out.println(onlydigit);
        System.out.println(onlyspecial);


    }


}
