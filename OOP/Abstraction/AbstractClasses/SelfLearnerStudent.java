package OOP.Abstraction.AbstractClasses;

public class SelfLearnerStudent extends Student{


    public void attend() {
        System.out.println("Self ;earner is attending");
    }
    public void watch(){
        System.out.println("self learner is watching");
    }
    public void sleep(int hour){
        System.out.println("Self learner is sleeping");
    }
    public SelfLearnerStudent(){
        super("Halicha", 22);
    }
}
