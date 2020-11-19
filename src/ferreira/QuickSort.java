package ferreira;

public class QuickSort {
    public static void main(String[] arg){
        //Give an Array
        int[] myArray = {3, 5, -6, 7, 30, 200, -20};

        quickSort(myArray, 0, myArray.length);

        //Display
        for (int i : myArray) {
            System.out.println(i);
        }
    }

    //take the array to be sort
    public static void quickSort(int[] input, int start, int end) {
        //If that is the case we have an one element array so it just returns
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    //Will return the correct position of the pivot in the sorted array
    public static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            //Empty loop body
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }
            //Empty Look body
            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
