package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniquePractice {
    public static void main(String[] args) {
        ArrayList <String> names= new ArrayList<>();
        names.add("Zack");
        names.add("Zack");
        names.add("David");
        names.add("David");
        names.add("Jack");
        names.add("Jessi");

        HashSet <String> hashset= new HashSet<>();
        //first idea
        hashset.addAll(names);
        System.out.println(hashset);
// second idea
        HashSet <String> hashset1= new HashSet<>();
        for (String name: names){
            hashset1.add(name);
        }
        System.out.println(hashset1);

        // third idea use iterator



        // fourth idea -> use constructor of set, pass source collection into the constructor of set
        HashSet <String> hashset2= new HashSet<>(names);
        System.out.println(hashset2);
        System.out.println(names);

        HashSet items=new HashSet();
        items.add("microphone");
        items.add("cable");
        items.add("computer");
        List listOfItems= new ArrayList(items);
        System.out.println(listOfItems);

    }
}
