package str;

public class methods1 {
    public static void main(String[] args) {
            String device="microphone";
            device.concat("is an input device");
        System.out.println(device);
            char ch=device.charAt(1);
        System.out.println(ch);

        //length();
      int lettercount=device.length();//returns number
        System.out.println(lettercount);
            device +=" is expensive";
           device= device.concat(" device");
        System.out.println(device.length());

        // take last char from this last version of the string
        System.out.println(device.charAt(29));//e

        String example="bells in fixed suspension and tuned in chromatic order, carillons are usually owned by churches, universities, or municipalities. The bells are struck with clappers connected to a keyboard of wooden batons";
        char lastchar=example.charAt(example.length()-1);
        System.out.println(lastchar);

        String example2="thanksgiving is over.the price of the turkey will go down" + ".so you can find more inexepensive purchases";
        int count=  example2.length();
       char lastletter= example2.charAt(count-1);
        System.out.println(lastletter);


        String school="techtorial";

//find the middle char from last string

        System.out.println(school.charAt((school.length()-1)/2));
        System.out.println(example.charAt((school.length()-1)/2));
        System.out.println(example2.charAt((school.length()-1)/2));


      //  System.out.println(school.charAt(15));//StringIndexOutOfBoundsException  ,  since ther is no 15th index


    }
}
