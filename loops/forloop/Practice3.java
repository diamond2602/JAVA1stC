package loops.forloop;

public class Practice3 {
    public static void main(String[] args) {
        //print out every letter from the string
        //print index of the letter and * together with the letter >> 0*T 1*0 2*d
        String str = "Today is Snowy";

        for (int index = 0; index < str.length(); index++) {
            System.out.print(index + "*" + str.charAt(index) + " ");
        }
            //print out only letter 'y' from the string
            System.out.println();
            for (int i=0; i<str.length(); i++){
                if (str.charAt(i)=='y'){
                System.out.println(i + ""+ str.charAt(i));
                }
            }

         // count the number of letter 'n' in the given string
        //"there are ....'n' in the string"
        int count =0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='n'){
                count++;
                //System.out.println(count);
            }
            //System.out.println(count);
        }
        System.out.println("there are " +count + " letter n in the string");





    }

}
