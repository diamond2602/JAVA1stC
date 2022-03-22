package replithomeworkfiles;

public class CountOfWords {
    /*
    Create a method named wordCount that takes
    one String as parameter and returns count of
    words from the string as an integer.

Example: Given string is "We love coding" Output : 3
     */
    class Main {
        // Please create the wordCount method here
        public int wordCount(String str) {
            String[] word = str.split(" ");
            return word.length;
        }

    }
}