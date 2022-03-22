package map;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //
        HashMap <Integer, String> cookies= new HashMap<>();
        cookies.put(8, "chocolate");
        cookies.put(2, "oreo");
        cookies.put(6, "browne");
        cookies.put(4, "browne");
        cookies.put(11, "browne");

        printKeysOneByOne(cookies);
        printValuesOneByOne(cookies);
    }
    // create a method that will take a map<Integer, String> as a parameter
    // and it will print out keys from that map  one by one
    public static void printKeysOneByOne(Map<Integer, String> map){
        map.keySet();
        for (Integer key: map.keySet()){
            System.out.println(key);
        }

    }
    // create a method that will take a map<Integer, String> as a parameter
    // and it will print out VALUES from that map  one by one
    public static void printValuesOneByOne(Map<Integer, String> map){
        for(String value: map.values()){
            System.out.println(value);
        }
    }
}
