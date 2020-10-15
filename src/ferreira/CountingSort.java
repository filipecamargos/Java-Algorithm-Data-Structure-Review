package ferreira;

public class CountingSort {

    //Couting Sort assume that all the values are within a range here between 1 and 10 included
    //And they have a specific size of 10
    public static void main(String[] arg) {
        //Give an Array
        int[] myArray = {1, 5, 6, 7, 10, 3, 1, 4, 2, 2};

        countingSort(myArray, 1, 10);

        for (int i : myArray) {
            System.out.println(i);
        }

    }

    public static void countingSort(int[] input, int min, int max) {
        int [] countArray = new int[max - min + 1];

         for (int i = 0; i < input.length; i++) {
             countArray[input[i] - min]++;

         }

         int j = 0;
         for (int i = min; i <= max; i++) {
             while(countArray[i -  min] > 0) {
                 input[j++] = i;
                 countArray[i - min]--;
             }
         }
    }
}
