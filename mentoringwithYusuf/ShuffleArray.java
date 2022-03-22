package mentoringwithYusuf;

import java.util.Random;

public class ShuffleArray {

    public static int[] shuffle(int[] array){
        // [5,3,4] 3
        Random random= new Random();
        for (int i=0; i< array.length; i++){
            int randomIndex= random.nextInt(array.length);
            int temp= array[randomIndex];
            array[randomIndex]=array[i];
            array[i]=temp;
        }
        return array;
    }
}
