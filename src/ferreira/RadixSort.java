package ferreira;

public class RadixSort {
    public static void main(String[] arg){
        int[] myArray = {4123, 5471, 8963, 1579, 3527, 2564};

        radixSort(myArray, 10, 4 );

        for (int i : myArray) {
            System.out.println(i);
        }
    }

    public static void radixSort(int[] input, int radix, int width) {
        for(int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input){
            countArray[getDigit(position, value, radix)]++;
        }
        //This will adjust the arrayCount
        for (int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }

        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int tempIndex = 0;  tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
