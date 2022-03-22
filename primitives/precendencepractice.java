package primitives;

public class precendencepractice {
    public static void main(String[] args) {

        int num1=5;
        int num2=10;
                                       //3  --> taking integer
        int result=num1+num2 * num2 +num1/3-1; //5 +100+1-1=105
        System.out.println(result);

        int count= 6/3+5%3-(4+1*(5*2-1)); //-9
        System.out.println(count);
    }
}
