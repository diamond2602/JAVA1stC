package object;

public class MathPractice {
    public  void sum(){
        int a=11;
        int b=22;
        int sum = a+b;
        System.out.println(a+" + " +b+ " = "+sum);
    }
    public  void total(int numb1, int numb2){
        int total=numb1+numb2;
        System.out.println(numb1+" + " +numb2+ " = " + total);

    }
    public int sum2(int number1, int number2){
        int result = number1+number2;
        System.out.println(number1+" + " +number2+ " = " + result);
        return result;
    }
    public String speak(){
        String string="test";
        string = string.toUpperCase();
        int i=23;
        i++;
        return i+"this is example of string return type" +string;
    }
    public String numberToString(double d){
        return "" +d;
    }
}
