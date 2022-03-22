package OOP.FinalPractice;

public class Shirt {

    final String COLOR="White";
    double price;
    char size;
    String material;

    public Shirt(String color, double price, char size, String material) {
       // this.COLOR = color; ---> it will not compile, since COLOR is Final
        this.price = price;
        this.size = size;
        this.material = material;
    }
public void setCOLOR(String color){
      // this.COLOR=color; ---> it will not compile, since COLOR is declared  Final
}

    public Shirt(){
        System.out.println("This is no argument constructor");
    }

   final public /*or 'final' here*/ void wash(){
        System.out.println("You can wash this Shirt");
    }


    public boolean fit(char size){
        boolean yes=false;

        if(this.size==size) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Shirt shirt=new Shirt();
        System.out.println(shirt.COLOR);
      //  shirt.COLOR="Black"; ---> it will not compile, since COLOR is declared  Final


    }

}
