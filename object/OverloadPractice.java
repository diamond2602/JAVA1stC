package object;

public class OverloadPractice {
    // find sum of rwo numbers
    public void sum (int num1, int num2){
        System.out.println("sum is: " + (num1+num2));

    }
    public void sum (int[] numbers){
        int sum=0;
        for (int number: numbers){
            sum=sum+number;
        }
        System.out.println("sum of array elements: " +sum);
    }
    public void sum(String something, int num1, int num2){
        System.out.println(something+ (num1+num2));
    }
}
