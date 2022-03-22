package str;

public class methods2 {
    public static void main(String[] args) {
        String flower="Rose";
       int index0fR= flower.indexOf('R');
        int index0fR1=flower.indexOf("R");
        System.out.println("first impementation " +index0fR1);

        System.out.println(flower.indexOf("o"));//1
        System.out.println(flower.indexOf("os"));//1
        System.out.println(flower.indexOf("o,s"));// if it does not find matching char/char sequence it will return -1
        System.out.println(flower.indexOf("r"));//-1
        System.out.println(flower.indexOf("Rose"));//0
        System.out.println(flower.indexOf("rose"));//-1
        System.out.println(flower.indexOf("Roses"));//-1


        String  object="Umbrella";
        System.out.println(object.indexOf('l'));// 5
        System.out.println(object.indexOf('l',6));
        System.out.println(object.indexOf('m',object.indexOf('m')+1));
        System.out.println(object.indexOf('r'));
        String sentence="I love lilies";
        System.out.println(sentence.indexOf('l',sentence.indexOf('i')));

        //toUppercase()--makes your string as Uppercase
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence);
        //toLowercase() --makes your string as Lowercase
        System.out.println(sentence.toLowerCase());

        //think about single letter uppercase from a string
        String str="Just do it";
        // index0f() --> returning number
        // charAt() --> returning char

        char letter=str.charAt(str.indexOf("d"));
        String str2="";
        str2 +=letter;
        System.out.println(str2.toUpperCase());


    }
}
