package object;



public class TestAnimal {
    public static void main(String[] args) {

        Animal cat = new Animal();
        System.out.println(cat.name);
        cat.name ="Leo";
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);
        cat.age= 9;
        cat.color="orange";
        System.out.println(cat.color);

        // create a dog animal, try to use instance variables with your new object
Animal dog= new Animal();
dog.age=2;
dog.color="black";
dog.name= "Max";
dog.breed="boxer";
        System.out.println(dog.name);
        System.out.println(dog.color);
        System.out.println(dog.age);
        System.out.println(dog.breed);
        System.out.println(cat.breed);

cat.breed="scottish";
        System.out.println(cat.breed);
cat.sleep();
dog.sleep();
cat.eat();
dog.eat();
cat.run();

        System.out.println(cat.energy);
        System.out.println(dog.energy);
        cat.run();
        cat.run(); //energy of cat is 70
        cat.sleep();
        System.out.println(cat.energy);

        // charge up the animal when they sleep
    }
}
