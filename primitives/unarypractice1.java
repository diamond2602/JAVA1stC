package primitives;

public class unarypractice1 {
    public static void main(String[] args) {
        int studentnumber=25;
        System.out.println(studentnumber);

        int num1=studentnumber++;
        System.out.println(num1);

        int num2=studentnumber++;
        System.out.println(num2);



        studentnumber=studentnumber++;
        System.out.println(studentnumber);

        studentnumber=studentnumber++;

        System.out.println(studentnumber);
        studentnumber=++studentnumber;
        System.out.println(studentnumber);

        int count=5;
        System.out.println(count++); //5
        System.out.println(++count); // 7

          // int studentnumber =25;
        System.out.println(studentnumber++); // shows 25 but it is 26
        System.out.println(studentnumber); //shows 26 and it is still 26
        studentnumber++;
        System.out.println(studentnumber);

        //int count =5;
        System.out.println(++count); //increases to 6 and shows6

//-------------------------

        System.out.println(count++); //shows 6 it is 7

        int number=8;
        System.out.println(number--); //shiowing 8 it is 7
        System.out.println(number--);// show 7 it is 6
        System.out.println(--number); //shows 5 it is 5

        number++;
        System.out.println(number++ + number++); //shows 13 number is 8
        System.out.println(number);

        int result =--number + --number +2 - number++*2;
        System.out.println(result); // result is 3 number is 7
        System.out.println(number);

        int a = ++number;
        System.out.println(a);



    }
}
