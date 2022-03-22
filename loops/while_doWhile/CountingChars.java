package loops.while_doWhile;

public class CountingChars {
    public static void main(String[] args) {
        /*-count letters, digits and other characters in the String
  String str = "$3%GTlk64mn^y?";
  sout("There are <..> letters in the string");
  sout("There are <..> digits in the string"); */
        String str = "$3%GTlk64mn^y?".toUpperCase();
       int index =0;
       int lettercounter=0, digitcounter=0, charcounter=0;
        do {
            if (str.charAt(index)>='A'&& str.charAt(index)<='Z'){
                lettercounter++;
            }else if(str.charAt(index)>='0'&&str.charAt(index)<='9'){
                digitcounter++;
            }else {charcounter++;
            }
            index++;
        }while (index<str.length());
        System.out.println("there are " +lettercounter + " letters in the string");
        System.out.println("there are " +digitcounter + " numbers in the string" );
        System.out.println("there are " +charcounter +" symbols in teh string");

//======================================
        while (index<str.length()){
            if (str.charAt(index)>='A'&& str.charAt(index)<='Z'){
                lettercounter++;
            }else if(str.charAt(index)>='0'&&str.charAt(index)<='9'){
                digitcounter++;
            }else {charcounter++;
            }
            index++;

        }

    }
}
