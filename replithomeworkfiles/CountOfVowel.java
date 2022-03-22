package replithomeworkfiles;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountOfVowel {
    /*
    Create a method named countVowel that takes one
    string as parameter and finds the count of every vowel
    from the string and returns as Map<String,Integer>. EXAMPLE:
    Given string is "What A nice day to code". Output: "a" , 3 "i" , 1
     "e" , 2 "o" , 2 NOTE : THere are 5 (a, e, i, o, u) vowels in alphabet.
     */
// Create the countVowel method here
    public Map countVowel(String string) {
        string = string.replace(" ", "").toLowerCase(Locale.ROOT);
        HashMap<String, Integer> map = new HashMap<>();
        String count = "";
        for (int i = 0; i < string.length(); i++) {
            count = string.substring(i, i + 1);
            if (count.equals("a") || count.equals("e") || count.equals("i") ||count.equals("o") || count.equals("u")) {
                if (!map.containsKey(count)) {
                    map.put(count, 1);
                } else {
                    map.put(count, map.get(count) + 1);
                }
            }
        }
        return map;
    }

}
