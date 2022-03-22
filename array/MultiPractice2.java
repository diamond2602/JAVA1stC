package array;

public class MultiPractice2 {
    public static void main(String[] args) {
        //states of different regions in US
        // print out every state one by one
      //  String[][] states = new String[][];
        String[][] states = { {"IL", "OH",}, {}, {"CA", "WA", "OR", "UT"}};
        for (String[] state: states){
            for (String st : state){
                System.out.println(st);
            }
        }

    }
}
