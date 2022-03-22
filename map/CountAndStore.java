package map;

import java.util.HashMap;

public class CountAndStore {
    public static void main(String[] args) {
         String [] drinks={"coke","water", "coke", "coffee","ayran", "water","ayran"
                 ,"ayran","ayran","ayran","ayran"};
         // you want to store these drinks into a map with the
        // amount that how many times that you see them in the array

     //   <key, Value>
        // coke2
        //water2
        //coffee 1
        // ayran 1

        HashMap <String, Integer> map= new HashMap();
       for (String drink: drinks){
           if(!map.containsKey(drink)){
           map.put(drink,1);
           }else{
               map.put(drink, map.get(drink)+1);
           }
       }
        System.out.println(map);
    }
}
