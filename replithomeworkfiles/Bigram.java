package replithomeworkfiles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bigram {
    /*
    A bigram is any two adjacent words in the text disregarding case and punctuation. A histogram is the count of how many times that particular bigram occurred in the text. Create a method named bigram in Main class that will take one string as parameter and it will RETURN map with count of particular bigram occurred in the text. EXAMPLE: Given the text: "The quick brown fox and the quick blue hare" The bigrams with their counts would be Output: “the quick” 2 “quick brown” 1 “brown fox” 1 “fox and” 1 “and the” 1 “quick blue” 1 “blue hare” 1

NOTE: Map you will return will be Map<String,Integer>.
     */

    // Create the bigram method here
    public static Map<String, Integer> bigram(String str){
        str=str.toLowerCase();
        String[] newStr = str.split(" ");
        String[] twoWords = new String[newStr.length];
        HashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <newStr.length-1; i++){
            twoWords[i] = newStr[i] + " " + newStr[i+1];
            if (!map.containsKey(twoWords[i])){
                map.put(twoWords[i],1);
            }else {
                map.put(twoWords[i], map.get(twoWords[i])+1);
            }
        }
        return map;
    }
}
