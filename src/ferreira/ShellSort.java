package ferreira;

public class ShellSort {

    public static void main(String[] args) {
        //Give an Array
        int[] myArray = {3, 5, -6, 7, 30, 200, -20, 10, -5};

        //Start the gap value and reduce on each interation
        for (int gap = myArray.length / 2; gap > 0; gap /= 2){

            for (int i = gap; i < myArray.length; i++) {
                int newElement = myArray[i];

                int j = i;

                while (j >= gap && myArray[j - gap] > newElement) {
                    myArray[j] = myArray[j - gap];
                    j -= gap;
                }

                myArray[j] = newElement;

            }

        }

        for ( int i : myArray ) {
            System.out.println(i);
        }
    }
}
