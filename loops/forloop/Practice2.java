package loops.forloop;

public class Practice2 {
    public static void main(String[] args) {
        // print out numbers between 0 to 5 decreasing by using for loop
        //5, 4, 3..0
      /*  for ( int number=5; number>=0 ; number--){
            System.out.println(number);

        }*/

        // find sum of numbers between 1 to 5 by using for loop
// 1+2+3+4=10
        int sum=0;
        for (int num=1; num<5; num++){
            sum+=num;
            System.out.println("final total >> " +sum);
        }
    }
}
