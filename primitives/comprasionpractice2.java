package primitives;

public class comprasionpractice2 {
    public static void main(String[] args) {
        // there is an event for kids if child's height is 48" or more they can attend this event
        // print out the result if kid can attend or not
        double reqkidheight=48;
        double youkidheight= 44;
        boolean canattend=youkidheight >= reqkidheight;
        System.out.println("can this child attend this event? " +canattend);

        // if the age of child is 6 or less it will be free

        int reqage=6;
        int kidage=7;
        boolean isfree=kidage<=reqage;
        System.out.println("is this event free for this child? " +isfree);




    }
}
