package loops.while_doWhile;

public class whilepractice2 {
    public static void main(String[] args) {
        //task
       // 'my age is 21'
       // 'my age is 22'
        //...
       // '26'
        int age= 21;
        int year=2021;
while (age<=26){
    System.out.println("your age is "+age +"in " +year++);
    age++;
    //age++1;
    //age=age+1;

}
//print out number betweet 10 to 20 icluded
        int num=10;
        while(num<=20){
            System.out.print(num+" ");
            num++;
        }
    }
}
