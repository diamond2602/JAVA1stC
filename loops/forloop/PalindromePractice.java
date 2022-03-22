package loops.forloop;

public class PalindromePractice {
    public static void main(String[] args) {
        //efe, 1234321. civic, ana

        String str="civic";
        String reverse="";
        for (int i=str.length()-1; i>=0; i--) {
            reverse +=str.charAt(i);
        }
        if (reverse.equalsIgnoreCase(str)) {
            System.out.println(str + " -- it is a palindrome");
        }else{
            System.out.println(str+ " -- it is not a palindrome");

            //find out if given number is a palindrome number or not

            int number=1234321;
            String  STR1=""+number;
        }

    }
}
