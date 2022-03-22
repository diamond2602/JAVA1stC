package OOP.Abstraction.Interfaces;

public class Eagle implements CanFly{

    String color;

   @Override
    public void fly(){

       System.out.println("Eagle is flying");
   }

   public void info(){
    System.out.println("Eagle is :" +color);
}
}
