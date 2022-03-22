package WrapperClass;

public class StringToPrimitive {
    public static void main(String[] args) {
        String str="12";
        System.out.println(str+10);// 1210

      int number=  Integer.parseInt(str); // unboxing
        System.out.println(number+10);// 22
        Integer number1=  Integer.parseInt(str);

        System.out.println(number1.equals("12"));
        System.out.println(number==12);

        //128
       byte by= Byte.parseByte("121");
        System.out.println(by);
      //  int number2=Integer.parseInt("128gb"); //NumberFormatException

        //"true"

        Boolean bl= Boolean.parseBoolean("True");
        System.out.println(bl);
        Boolean bl1= Boolean.parseBoolean("TRUe");
        System.out.println(bl1);
        Boolean bl2= Boolean.parseBoolean(" true");
        System.out.println(bl2);
        Boolean bl3= Boolean.parseBoolean("example");
        System.out.println(bl3);
        Boolean bl4= Boolean.parseBoolean("false");
        System.out.println(bl4);

       float   fl= Float.parseFloat("1.2");
        System.out.println(fl);
        float   fl1= Float.parseFloat("2.3f");
        System.out.println(fl1);

       long lg= Long.parseLong("345543254254");
        System.out.println(lg);
        double db=Double.parseDouble("4.5d");
        System.out.println(db);
        double db1=Float.parseFloat("4.5f");
        System.out.println(db1);

    }
}
