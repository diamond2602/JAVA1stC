package primitives;

public class booleanpractice {
    public static void main(String[] args) {
        boolean ishungry= true;
        System.out.println(ishungry);

        boolean islightOn= false;
        System.out.println(islightOn);

        System.out.println(ishungry==islightOn);

        islightOn=ishungry;
        islightOn=false;

        System.out.println("last version for ishungry >>" +ishungry); //true
        System.out.println("last for is light >>" +islightOn ); //false

    }
}
