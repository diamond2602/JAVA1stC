package arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToArraylList {
    public static void main(String[] args) {
        int[] numbers= {3,4,5,6};
     List<int[]> listnumbers =   Arrays.asList(numbers);
     Integer[] numbers1={3,4,5,6};
     List<Integer> listnumbers1= Arrays.asList(numbers1);
        System.out.println(listnumbers1);
    //    System.out.println(listnumbers1.add(7)); // UnsupportedOperationException
        for (int[] i: listnumbers){
            System.out.println(Arrays.toString(i));
        }
        Integer[] numbers2={3,4,5,6};
        List<Object> listnumbers2=Arrays.asList(numbers1);
        System.out.println(listnumbers2);

    }

}
