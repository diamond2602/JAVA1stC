package primitives;

public class truthtable2 {
    public static void main(String[] args) {
        // there is an event for kids
        //if the age of child is 6 or less or if the height of child is 48 inches or less
        // the event is free for that child

        int reqage=6;
        double reqheight =48;
        int yourage = 8;
        double yourheight=47;

        boolean isfree= reqage >= yourage || reqheight >=yourheight;
        System.out.println("is it free ? " +isfree);

        // find out if student can pass a class
        // there are 3  tests taken
        // average of those has to be more than 70
        // average rate of the student  has to be 80% or more
        // print out if student can pass or not
        int reqaverage=70;
        int test1= 80;
        int test2=80;
        int test3= 75;
        int reqattendance=80;
        int studentattendance=85;

       int average=(test1+test2+test3)/3;
        boolean canpass=average >=reqaverage && studentattendance >=reqattendance;
        System.out.println("can student pass?" +canpass);


    }
}
