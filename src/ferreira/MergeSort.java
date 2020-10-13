package ferreira;

/**
 * Merge Sorte
 */
public class MergeSort {

    public static void main(String[] arg) {
        //Give an Array
        int[] myArray = {3, 5, -6, 7, 30, 200, -20};

        mergeSort(myArray, 0, myArray.length);

        //Display
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    //merge sort method that do a recursion
    public static void mergeSort(int[] input, int start, int end) {
        //When the is one element array it is sorted so it will get out of the recursion
        if(end - start < 2) {
            return;
        }

        //Part the array
        int mid = (start + end) / 2;

        //MergeSort recursion take care of the left side of the array
        mergeSort(input, start, mid);

        //MergeSort recursion take care of the right side of the array
        mergeSort(input, mid, end);

        //Merge the arrays
        merge(input, start, mid, end);
    }

    //Merge method that will be called in the recursion
    public static void merge(int[] input, int start, int mid, int end){
        //It does not need to merge if they are already in order
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j= mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

}
