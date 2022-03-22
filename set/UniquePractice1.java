package set;


import java.util.*;

public class UniquePractice1 {
    public static void main(String[] args) {
        String[] letters={"a", "b", "c", "d", "d"};
        //store these elements into a set
// convert array to ArrayList >> Arraylist to set

       List listOfletters= Arrays.asList(letters);
       List listOfletters1= new ArrayList(Arrays.asList(letters));
       listOfletters1.add("r");

        System.out.println(listOfletters1);


      // listOfletters.add("t");
        System.out.println(listOfletters);

        TreeSet setofletters= new TreeSet(listOfletters);
setofletters.add("x");
setofletters.add("t");
        System.out.println(setofletters);

        Set set= new HashSet(Arrays.asList(letters));

        String[] letters1={"a","a", "b", "c", "d", "d", "t", "t", "a","t"};

        // show/print duplicate elements

        HashSet <String> hashSet= new HashSet<>();
        ArrayList duplicatestorage= new ArrayList();

for (String letter: letters1){
  if (!hashSet.add(letter)){
      System.out.println("this is a repeating element "+letter);
      duplicatestorage.add(letter);
  }

}
        System.out.println(hashSet);
        System.out.println(duplicatestorage);

    }
}
