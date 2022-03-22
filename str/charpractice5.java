package str;

public class charpractice5 {
    public static void main(String[] args) {

        //we will ask user to enter a char letter
        //
        //abcgefjhik


      // if the user neters char that is not an english letter
      //code should print false
      //is user enters english letter code shoild print true
      //ASCII table
      //the table that all char has a unique value

    /*  int charvaluea='a';
        System.out.println(charvaluea);
        char a=97;
        char a2='a';
        System.out.println(a);

        System.out.println("please enter a char letter");*/

        char ch='a';
        // if this ch is a letter or not.
      // if the value of the char between char a and char Z
      // it means this char is a letter
        boolean isletter=ch>='a'&&ch<='z'||ch>='A'&&ch<='Z';
        System.out.println(isletter);


    }
}
