package OOP.Abstraction.AbstractClasses;

public class OnlineStudent extends Student{

    public void attend(){
        System.out.println("Online Student is attending via zoom");
    }
    public void watch(){
        System.out.println("Online Student is watching now");
    }
    public OnlineStudent(){
        super("Mary", 25);
    }
public void sleep(int hour){
    System.out.println("Online student is sleeping");
}
}
