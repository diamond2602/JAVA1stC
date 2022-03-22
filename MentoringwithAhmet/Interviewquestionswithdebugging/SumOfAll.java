package MentoringwithAhmet.Interviewquestionswithdebugging;

public class SumOfAll {

        /*
        write a method that receive array an integer array
        and find even numbers total and find the sum odd numbers
        and difference between them
        1- create a method
        2- find the sum of even numbers 2+4+6+8...
        3-find the sum of odd numbers 1+3+5+7...
        4-find the difference between them 28
        int [] array= {1,2,3,4,5,6,7,8,9,22,65,76}
        */
        public static void main(String[] args) {
            // iam going to use main method to run my code
        int [] array= {1,2,3,4,5,6,7,8,9,22,65,76};
          SumOfAll(array);
    }
    public  static  void SumOfAll(int[] array) {
            // how can i find even numbers inside of the array
        int sumofoddnumber=0;
        int sumofevennumber=0;
        int difference=0;
        for (int number: array){
            if (number%2==0){
                sumofevennumber+=number;

            }else if (number%2!=0){
                sumofoddnumber+=number;

            }

        }
        System.out.println(sumofevennumber);
        System.out.println(sumofoddnumber);
        System.out.println(sumofevennumber-sumofoddnumber);
    }
}
