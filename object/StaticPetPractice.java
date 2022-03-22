package object;

public class StaticPetPractice {

    String name;
    int age;
    String color;  // these 3 lines are instance variable. with default values

    static double food = 20;   // without STATIC those 2  pets will get food from 2 separate bags
    // but we have only 1 bag, so they have to SHARE w/help of 'static'

    public static void eat (){   // we CREATED A METHOD called 'eat' // AAA //

        food -= 1;
        System.out.println("food amount now is: " +food);
    }    //--------------------------------------------------

    public void play(){
        System.out.println("pet is playing"); // line 36, 37
    }   //----------------------------------------------------

    public static void main(String[] args) {       // AAA //
        StaticPetPractice pet1 = new StaticPetPractice(); // created 1 pet

        pet1.eat(); // 19
        pet1.eat(); // 18

        StaticPetPractice pet2 = new StaticPetPractice(); // created a 2nd pet
        pet2.eat();
        //===============================
        eat();   // static method can be called without an object
        //---------------------------------
        StaticPetPractice.eat(); // can be called using a class name

        // non-static methods can't be called without an object

        // play();                   look at 18, 19
        //StaticPetPractice.play();
    }

}