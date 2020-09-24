package ferreira;

public class InsertionSort {

    public static void main(String[] arg) {
        //Give an Array
        int[] myArray = {3, 5, -6, 7, 30, 200, -20};

        /**
         * Assume that the first unsorted element is at position 1 Since it will start from right to left
         */
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++){

            int newElement =  myArray[firstUnsortedIndex];
            int i;

            for ( i = firstUnsortedIndex; i > 0 && myArray[i - 1] > newElement; i--){
                myArray[i] = myArray[i - 1];
            }

            myArray[i] = newElement;
        }

        for( int i : myArray ) {
            System.out.println(i);
        }
    }

}
