package object;

public class Car {
    String brand;

    public Car(String brand){
        this.brand=brand;
    }

    public void move(){
        System.out.println("car is moving");
    }
    public boolean move(String dest){
        System.out.println(brand+ " Moving to "+ dest);
        return true;
    }

@Override
    public String toString() {
     return "My car's brand is "+ brand;
    }

    @Override
    protected void finalize() {
        System.out.println("Finalize");
    }
}
