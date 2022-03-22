package loops.forloop;

public class PerfectNumber {
    public static void main(String[] args) {
        // perfect number
        //if sum of the divisors (exept number itself) equalls to numer, it is called perfect number > ex: 28

        //1,2,4,7,14,
int number=496;
int sum=0;
        for (int divisor=1;divisor<=number/2; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }

        }
        if(number==sum){
            System.out.println(number + " is a perfect number");
        }else {
            System.out.println(number + " is not a perfect number");
        }


    }
}
