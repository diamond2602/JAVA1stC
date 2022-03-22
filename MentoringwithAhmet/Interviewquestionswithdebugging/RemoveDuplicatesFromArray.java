package MentoringwithAhmet.Interviewquestionswithdebugging;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    /*
    int array[]={3,6,8,3,2,7,9}
    //Remove the duplicates from a from array. --> {3,6,8,2,7,9} expected result
Suggestion1: you should decide where to begin
Suggestion2: you should ask some questions to yourself like how can you check each number
Suggestion3: you should think about comparison? like compare the first number with all of them.
     // how can i reach out each of the number one by one==> loops
     // how can i compare the numbers with each other to make sure these numbers are unique or not?
     */
    public static void main(String[] args) {
        int array[] = {3,6,8,3,2,7,9,9};
        String unique = "";

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    isUnique = false;
                }

            }
            if (isUnique) {
                unique += array[i] + " ";
            }


        }
        String[] uniqueeNumbers = unique.split(" ");
        System.out.println(Arrays.toString(uniqueeNumbers));
    }

}



