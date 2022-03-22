package replithomeworkfiles;

import java.util.Set;
import java.util.TreeSet;

public class AscendingLIst {
    /*
    Create one method named ascending that takes one parameter
    as int array and return type of method is set.
    This methods needs to return all elements in an ascending order
    with no duplicates as a set of integers.
    Input: [2,3,4,4,7,2,1] Output: [1, 2, 3, 4, 7]
    Input: [42,42,24,24] Output: [24,42]
     */



            static int removeDuplicates(int arr[], int n)
            {
                if (n == 0 || n == 1)
                    return n;

                // To store index of next unique element
                int j = 0;

                // Doing same as done in Method 1
                // Just maintaining another updated index i.e. j
                for (int i = 0; i < n-1; i++)
                    if (arr[i] != arr[i+1])
                        arr[j++] = arr[i];

                arr[j++] = arr[n-1];

                return j;
            }

            public static void main (String[] args)
            {
                int arr[] = {4, 2, 3, 3, 1, 4, 1, 5, 5};
                int n = arr.length;

                n = removeDuplicates(arr, n);

                // Print updated array
                for (int i=0; i<n; i++)
                    System.out.print(arr[i]+" ");
            }
        }




