package primitives;

public class truthtable1 {
    public static void main(String[] args) {
        // visa and ticket
        boolean visa=true;
        boolean ticket= true;
        boolean myvisa=false;
        boolean myticket=true;
         boolean cantravel =      visa ==myvisa && ticket==myticket;
        System.out.println(cantravel);
        //ask question
        boolean online=true;
        boolean campus=true;
        boolean student=true;
        //student ==online || student == campus;
        boolean askquestion=student==online || student==campus;
        System.out.println("can i ask a question? " +askquestion);

        // 90% or more attendance and score of 80 or more to pass this class

        int reqattendance=90;
        int reqscore =80;
        int yourattendance = 100;
        int yourscore=79;

        boolean pass= yourattendance >= reqattendance && yourscore >=reqscore;
        System.out.println("can i pass the course? " +pass);





    }
}
