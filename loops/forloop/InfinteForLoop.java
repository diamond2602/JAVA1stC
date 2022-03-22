package loops.forloop;

public class InfinteForLoop {
    public static void main(String[] args) {
        for (int k=0; k<5; k++) {
            System.out.println("David");
        }
        //infinite loop
        int x=0;
        for (;  ;){
            System.out.println("zack");

          //  System.out.println(x); this statement will not be reached out since there is  infinite loop before it
        }
    }
}
