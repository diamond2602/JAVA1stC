package mentoringwithYusuf;

public class RemoveWhiteSpaces {

    //What is white space?
    // " ", "\n", "\r", "\t"
    public static String removeWhiteSpaces(String str){
        // char array out of string
        char[] charArray= str.toCharArray();
        String withoutWhiteSpaces="";
        for (int i=0; i< charArray.length; i++){
            if (!Character.isWhitespace(charArray[i])){
                withoutWhiteSpaces+=charArray[i];
            }
        }
        return withoutWhiteSpaces;

    }


}
