package ferreira;

public class BinarySearch {
    //The array must be sorted in order the binary search to work
    public static void main(String[] args) {
        int[] myArray = {-1, 4, 8, 11, 100, 110, 111, 133};
        System.out.println(interactiveBinarySearch(myArray, -1));
        System.out.println(interactiveBinarySearch(myArray, 110));
        System.out.println(interactiveBinarySearch(myArray, 8));
        System.out.println(interactiveBinarySearch(myArray, 133));
    }

    public static int interactiveBinarySearch(int[] array, int n) {
        if(array.length < 1) {
            return -1;
        }

        int start = 0;
        int end = array.length;

        while(start < end) {
            int mid = (start + end) / 2;

            if(array[mid] == n) {
                return mid;
            }
            else if (array[mid] > n){
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
