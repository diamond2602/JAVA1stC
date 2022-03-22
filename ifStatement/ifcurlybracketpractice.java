package ifStatement;

public class ifcurlybracketpractice {
    public static void main(String[] args) {
        int number=1234;
        if (number==1234)
            System.out.println("number is equals to 1234");
            System.out.println("number is not equals to 1234");

            if (number==5)
                System.out.println("hello world");
                System.out.println("hello java");

                int num1=6;
                 if (num1<10)
                     num1++;
        System.out.println(num1);
        int num2=4;
        if (num2>20)
            num2++;
        System.out.println(num2);

        if (num2>20){
            num2++;
            int x=number+num2+67;
            x=x*7;
            System.out.println("I am in the curly--> "+num2);

                    }
        int a=9;
        if (1==2)
            a=2+2;
        System.out.println("=====");
        System.out.println(a);

        int capacity=20;
        int studentnumber=25;
        if (capacity>studentnumber)
            System.out.println("THERE IS ENOUGH SPACE IN THE CLASSROOM");
        studentnumber++;
        System.out.println(studentnumber);
    }
}
