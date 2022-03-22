package Stringbuilder;

public class RemoveDashesTask {

    // create a method that will take Stringbuilder as parameter and
    // this method will delete "dashes"(-) from it
    // and return/show the word without dashes

    //  I-n-te-rv-i-ew--> Interview

    public static void deletingDash(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '-') {
                builder.deleteCharAt(i);
                i--;
            }

        }
        System.out.println(builder);
    }
        public static void main (String[]args){
            StringBuilder stringBuilder = new StringBuilder("--I-n-----te-rv-i-ew");
            deletingDash(stringBuilder);
        }
    }

