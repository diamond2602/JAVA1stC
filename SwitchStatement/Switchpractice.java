package SwitchStatement;

public class Switchpractice {
    public static void main(String[] args) {

        int number=2000;
        System.out.println("before switch");
        switch (number){

 //           default:
 //               System.out.println("this is default case");
 //               break;
            case 123:
                System.out.println("this is fourth case");
                break;
            case 110:
                System.out.println("This is second case");
                break;
            case 120:
                System.out.println("this is third case");
                break;

            case 130:
                System.out.println("this is fifth case");
                break;
            case 100:
                System.out.println("this is first case");
                break;

        }
        System.out.println("after switch");
    }
}
