package binary_search;

public class BinarySearch {

    /**
     * find the num index in the arr
     *
     * */
    public int search(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            //>>> in case of overflow
            int mid = (high + low) >>> 1;
            if (num > arr[mid]) {
                low = mid + 1;
            } else if (num < arr[mid]) {
                high = mid - 1;
            } else {
                return mid; //num found
            }
        }

        //not found, we return the current index
        return ~low;

    }
}
