package object;

public class TestMath {
    public static void main(String[] args) {
        MathPractice object = new MathPractice();
        object.sum();

        object.total(4,5);
        object.total(10,5);
        object.total(232432, 243242);
       // System.out.println(object.sum());
        //you can not use method which has void return type in the sout

        int a=object.sum2(2,3);
        int x=a*a;
        System.out.println(x);
        String str=object.speak();
        System.out.println(str);
        System.out.println(object.speak());
// call numberToString  method and do concatenation
        //with your first and last name and print  it out
       String str1= object.numberToString(8.7);
        str1=str1.concat("efe");
        System.out.println(str1);
        System.out.println(object.numberToString(3.4).concat("Alex"));
    }
}
