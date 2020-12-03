package ferreira;

public class QuickSort {
    public static void main(String[] arg){
        //Give an Array
        int[] myArray = {3, 5, -6, 7, 30, 200, -20, 33, 4, 7, 128, 99, 1000, 35, 3, 0};

        quickSort(myArray, 0, myArray.length);

        //Display
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    //take the array to be sort
    public static void quickSort(int [] array, int start, int end) {

        if ((end - start) < 2) {
            return;
        }
        //Create the recursion calling here
        int partitionPivot = partition(array, start, end);
        quickSort(array, start, partitionPivot);
        quickSort(array, partitionPivot + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        //First get the pivot, i for the beginning and j for the end
        int pivot = array[start], i = start, j = end;
        //Create the condition for to find part the array
        while (i < j) {
            //Decrement j until it finds a number that is smaller than pivot
            while (i < j && array[--j] >= pivot) ;
            if (i < j) {
                array[i] = array[j];
            }
            //increment i until it finds a number that is grater than pivot
            while (i < j && array[++i] <= pivot) ;
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;

        return j;
    }

}