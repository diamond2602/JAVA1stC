package set;

import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {


        TreeSet<Integer> zipcodes = new TreeSet<>();
        zipcodes.add(44);
        zipcodes.add(11);
        zipcodes.add(22);
        zipcodes.add(55);

        // first()
        System.out.println(zipcodes.first());

        //last()
        System.out.println(zipcodes.last());

        //pollFirst()
        System.out.println(zipcodes.pollFirst());
        System.out.println(zipcodes);

        zipcodes.add(77);
        Integer i= zipcodes.pollLast();

// pollLast
        zipcodes.pollLast();
        System.out.println(zipcodes);

        // descendingSet()
        System.out.println(zipcodes.descendingSet());
    }
}