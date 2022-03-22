package arrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {

        /*===TASK===:
-Create an ArrayList that will store 5 fruit names
-Print out stored values by using for Loop
*/
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("grapes");
        fruits.add("kiwi");

        for (String fruit : fruits) {
            System.out.println(fruit);


        }
        System.out.println("this is after first for loop");
printFruits(fruits);
        System.out.println("this is after removing");
        removeFruits(fruits);
    }
//create  a method  that will take arraylist as a parameter of fruits
// this method will print out fruits if it has 5  or more letters

        public static void printFruits(ArrayList<String> fruits) {
            for (String fruit : fruits) {
                if (fruit.length() >= 5) {
                    System.out.println(fruit);
                }
            }
        }
        //create a method that will take arraylist as a parameter of fruits
        //this method will remove elements that has 4 or less letters from the arraylist
        public static void removeFruits(ArrayList<String> fruits) {
            for(int i=0; i<fruits.size(); i++){
                if (fruits.get(i).length()<=4){
                    fruits.remove(i);
                }
            }
            System.out.println(fruits);
        }

    }


    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// Aliya version

  /*  public static void main(String[] args) {
         /*===TASK===:
         -Create an ArrayList that will store 5 fruit names
         -Print out stored values by using for Loop

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Watermelon");
        fruits.add("Kiwi");

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println("==>1 after first for loop");
        printFruits(fruits);
        System.out.println("===>2 after removing");
        removeFruits(fruits);



    }
    //create a method that will take array list as a parameter of fruits
    // and this method will print out fruits if it has 5 or more letters
    public static void printFruits(ArrayList<String> fruits){

        for(String fruit: fruits){
            if (fruit.length()>=5){
                System.out.println(fruit);
            }
        }

    }
    // create a method that will take arrayList as a parameter of fruits
    //this method will remove elements that has 4 or less letters from
    public static void removeFruits(ArrayList<String> fruits){

        for(int i=0; i<fruits.size(); i++){
            if (fruits.get(i).length()<=4){
                fruits.remove(i);
            }
        }
        System.out.println(fruits);

    }





}
*/