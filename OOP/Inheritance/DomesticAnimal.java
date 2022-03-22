package OOP.Inheritance;

public class DomesticAnimal extends  Animal{

    @Override
    public void eat() {
        System.out.println(name+" Domestic animal is eating");
    }
}
