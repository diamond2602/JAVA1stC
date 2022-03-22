package Stringbuilder;

public class FindSum {
    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder("turs4o_9_i_2");
        sum(stringbuilder);

    }

    // create a method to find sum of digits from a Stringbuilder parameter
    //Stringbuilder --> numbers = "turs4o_9_i_2";


    public static void sum (StringBuilder builder){
       double sum=0;
        for (int i = 0; i< builder.length(); i++){
            if(Character.isDigit(builder.charAt(i))){
String str= ""+builder.charAt(i);
double num= Double.parseDouble(str);
                sum +=num;
//sum+=builder.charAt(""+builder.charAt(i);); another version
            }
        }
        System.out.println(sum);

    }
}
