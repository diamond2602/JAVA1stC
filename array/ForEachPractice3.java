package array;

import java.util.Arrays;
import java.util.Locale;

public class ForEachPractice3 {
    public static void main(String[] args) {
        String [] names={"John", "Brian", "Nina", "David"};
        // create email address for each of the names in the array
        //john@gmail.com, brian@gmail.com
// store this e-mails in an array
        // if it is gmail e-mail, store it in gmail array
        //if it is yahoo e-mail. store it in yahoo array

        String[] gmails=new String[names.length];
        String[] yahoomails=new String[names.length];

        for(String name: names){
            String email=name+ "@gmail.com";
            String ymail=name.toUpperCase().concat("@yahoo.com");
            System.out.println(name+ "@gmail.com");
            System.out.println(name.toUpperCase().concat("@yahoo.com"));
        }
        System.out.println("*************************");
        for (int i=0; i< names.length; i++){
            gmails[i]=names[i]+"@gmail.com";
            yahoomails[i]=names[i].toUpperCase().concat("@yahoo.com");

        }
        System.out.println(Arrays.toString(gmails));
        System.out.println(Arrays.toString(yahoomails));

    }
}
