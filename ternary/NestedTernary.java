package ternary;

public class NestedTernary {
    public static void main(String[] args) {
        int num1=4,num2=5;
        // condition ? :
      String r1=  ++num1 >=num2 ? num1 < num2 ? "java" : "selenium": "Nested";
        System.out.println(r1);

        String r2=  num1 <1 ? num1 < num2 ? "java" : "selenium": num1 <1 ? "Summer" : "winter";

        System.out.println(r2);

        System.out.println(1!=1?"David" : 1>2? "nested first side":3==4? "second side of first": "second side of second");


    }
}
