package loops.forloop;

public class NestedPrctice {
    public static void main(String[] args) {

        System.out.println("Beginning of the execution");
        for (int i=0; i<3; i++){
            System.out.println("I am first for loop");



            for (int j=0; j<5; j++){
                System.out.println("I am nested for loop");
            }


        }


        System.out.println("End of the execution");

    }
}
