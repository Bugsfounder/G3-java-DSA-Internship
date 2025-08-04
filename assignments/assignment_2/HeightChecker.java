package assignments.assignment_2;
import java.util.Arrays;

public class HeightChecker {

    static void countSort(int[] unsortedArray, int[] sortedArray){
        /*
        1.create array of size 101,
         because constraint give 1 to 100, but index is starting from 0,
         we have to add one more element, if we create till 100, we got element till 0 to 99
        */
        int[] indexArray = new int[101];

        /*
         2. iterate over unsortedArray and increase frequency of all elements at elements index in indexArray.
        */

        for (int item: unsortedArray){
            indexArray[item]++;
        }

        /*
            3. iterate over indexArray, and insert elements using it in sortedArray.
        */
        int j = 0;
        for (int i = 0; i < indexArray.length; i++) {
            if (indexArray[i]!=0){
                while (indexArray[i] > 0){
                    sortedArray[j] = i;
                    j++;
                    indexArray[i]--;
                }
            }
            if (j > sortedArray.length){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3,1,2};
        int[] sortedArr = new int[arr.length];

        countSort(arr, sortedArr);

        System.out.println(Arrays.toString(sortedArr));

        // check incorrect height
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=sortedArr[i]){
                count++;
            }
        }

        System.out.println(count);


        // countSort2
        System.out.println(Arrays.toString(countSort2(new int[]{2,1,4,3,6,5,5,5}, 100)));
    }

   static int[] countSort2(int[] unsortedArray, int n){
        int[] indexArray = new  int[n+1];
        int[] sortedArray = new int[unsortedArray.length];
        int j = 0;
        for(int item: unsortedArray){
            indexArray[item]++;
        }

       for (int i = 0; i < indexArray.length; i++) {
           if (indexArray[i]!=0){
//                sortedArray[j] = i;
//                j++;
//                indexArray[i]--;

               // for repeated elements
               while (indexArray[i] > 0){
                   sortedArray[j] = i;
                   j++;
                   indexArray[i]--;
               }
           }

           if (j>unsortedArray.length){
               break;
           }
       }

       return sortedArray;
   }

}
