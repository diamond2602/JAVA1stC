package primitives;

public class castingpractice {
    public static void main(String[] args) {
        int number1=23;
        long l1=number1; //implicit casting (happens by java) --> convert smaller data type into bigger data type

        short sh1= (short) number1; // explicit casting  --> coverting bigger data type into smaller

        byte by1=1;
        byte by2=2;
        // short sum1=by1+by2; compile time error ( due to numeric promotion
        // java wants to store the result in to larger data type(int). that's why it's not compiling

        short sum1=(short)(by1+by2);  // explicit casting
        //short sum3 = (short)by1 + (short)by2; //this will not work. this indivual casting for each variable
        // result is not caste yet


        int price =(int) 750.99;  // changing data type not converting
        System.out.println(price);



        double samsung=900.45;
        int pricesamsung= (int)samsung;
        System.out.println("samsung--> " +samsung);
        System.out.println("price samsung in int---> " + pricesamsung);
    }
}
