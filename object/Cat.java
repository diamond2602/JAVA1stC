package object;

public class Cat {
    String name;
    int age;
    String color;
    int foodAmount;
    // create a method named as run(), it will take parameter as destination,
    // it will reduce food amount by 1 every execution
    //it will print out as "cat is running ...<west>"
public void run(String destination){
    foodAmount -=1;
    System.out.println(name + " is running to " + destination);
}
// overload the run method with your own preference

    public void run(){
            System.out.println("Overloaded run method in the cat class");
    }


// create a method named as setColor(), it will take a parameter and initialize the color of the cat
    public void SetColor(String newColor){
    color=newColor;
        }

        // create a method that will return color of cat , name it as getColor()
public String getColor(){
    return color;
}



    public static void main(String[] args) {
        Cat cat1= new Cat();
        cat1.name="ginger";
        cat1.color="Orange";
        cat1.age=3;
        cat1.foodAmount=10;
        cat1.run("up");
        System.out.println(cat1.foodAmount);
        cat1.SetColor("White");
        System.out.println(cat1.color);
        System.out.println("This is coming from getcolor method ---> " +cat1.getColor());


    }
}
