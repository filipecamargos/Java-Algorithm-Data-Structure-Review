package ferreira;

public class SelectionSort {
    //Selection Sorting Implementation
    public static void main(String[] arg) {
        //Give an Array
        int[] myArray = {3, 5, -6, 7, 30, 200, -20, 7};

        //Go through the reverse part into it finds the part that it has been unsorted and 0 is already included
        //on the inside of it
        for(int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            //Determine the lagest element
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++){
                if(myArray[i] > myArray[largest]) {
                    largest = i;
                }
            }
            swap(myArray, largest, lastUnsortedIndex);
        }

        for ( int i : myArray ) {
            System.out.println(i);
        }

    }

    //1st Implement a swap method
    public static void swap (int[] myArray, int firstItem, int secondItem) {
        //If they are the same I just return
        if (myArray[firstItem] == myArray[secondItem]) {
            return;
        }

        //Swap
        int temp = myArray[firstItem];
        myArray[firstItem] = myArray[secondItem];
        myArray[secondItem] = temp;

    }
}
