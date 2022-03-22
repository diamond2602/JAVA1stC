package MentoringwithAhmet.Interviewquestionswithdebugging;

public class ReverseInArray {
    /*
    print out each of the word and reverse them from array.
    String example=Hi guys how are you
    Syug
    */
    public static void main(String[] args) {
        // I need to access each of the words
        //I need to store these words and reverse them?
        String example="hi guys how are you";
        String reverse="";
        String array[]=example.split(" ");
        for (int i=0;i<array.length; i++){
            for (int k=array[i].length()-1; k>=0;k--){
                reverse+=array[i].charAt(k);
            }
            System.out.println(reverse);
        }

    }
}
