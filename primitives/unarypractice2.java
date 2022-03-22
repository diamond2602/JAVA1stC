package primitives;

public class unarypractice2 {
    public static void main(String[] args) {

        int a=7;
        int b= 4;
        int result= --a + --b + a++ * 2 - b++ * a--;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);


        int donutnumber=12;
      int eachdonut= 2;
      int total = donutnumber*eachdonut;
        System.out.println(total);
        System.out.println(--total);

        char ch = 'a';
        System.out.println(ch);
        System.out.println(++ch);
        ch++;
        ++ch;
        System.out.println(ch);
        System.out.println(--ch);



    }
}
