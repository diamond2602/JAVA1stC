package replithomeworkfiles;


import java.util.Arrays;

public class Duplicates {
    /*Create a public method named duplicates
    that takes two int arrays as parameters and returns common
    elements of both arrays as an int array. IF there is no common
       element of arrays return null. NOTE: USE SORT METHOD ON
       ARRAY BEFORE YOU RETURN IT. For example:
       array 1 -> [1,2,3,45,6,6,7,9,8] and array 2 [2,3,9,10,11,12]

return int array is [2,3,9] -> !!array is sorted

example 2: array 1 -> [1,1,1,1,1,1,1,1] array 2 -> [1,1,2]

return int array is [1]

example 3 : array 1 -> [0,1,1,1,0] array 2 -> [2,9,90]

return null -> because there is no common element for arrays.

NOTE: This question might be harder than it seem, and it can take time .
Please make sure you covered all posibilities and your return type name
 etc. all correct. I tested this task with my solution and it passed so
 if you implement correct solution method on main.java, test shall pass.

GOOD LUCK !*/


//Aigul version:

        // create a method here
        // Do not forget return type of your method is int array and name of your method is duplicates
        public int[] duplicates (int [] nums, int [] nums2){
            String commons = "";
            for(int i=0; i<nums.length; i++){
                for (int j=0; j<nums2.length; j++){
                    if (nums[i]== nums2[j]){
                        commons += nums[i]+" ";
                    }
                }
            }
            if(commons.length()==0){
                return null;
            }
            String [] commonArray = commons.trim().split(" ");
            String commonsWithoutDuplicate= " ";
            for(int i=0; i<commonArray.length; i++){
                if(!commonsWithoutDuplicate.contains(" "+commonArray[i]+" ")){
                    commonsWithoutDuplicate+=commonArray[i]+" ";}
            }
            String [] commonsWithoutDuplicateArray = commonsWithoutDuplicate.trim().split(" ");
            int[]commonNumbers = new int [commonsWithoutDuplicateArray.length];
            for (int i=0; i<commonsWithoutDuplicateArray.length; i++){
                commonNumbers[i] =Integer.parseInt(commonsWithoutDuplicateArray[i]);
            }
            Arrays.sort(commonNumbers);
            return commonNumbers;
        }
    }






