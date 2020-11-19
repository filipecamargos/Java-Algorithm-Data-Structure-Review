package ferreira;
import java.util.Arrays;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class Bubblesorting {

    //Bubble Sorting Implementation
    public static void main(String[] arg) {
        //Give an Array
        int[] myArray = {3, 5, -6, 7, 30, 200, -20};

        //Come from end to front to
        for(int endSorting = myArray.length - 1; endSorting > 0; endSorting--){
            //From front to end
            for(int i = 0; i < endSorting; i++ ) {
                if(myArray[i] > myArray[i + 1]){
                    swap(myArray, i, i + 1);
                }
            }
        }

        for (int i: myArray) {
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
