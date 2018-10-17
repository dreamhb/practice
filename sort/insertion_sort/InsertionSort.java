package insertion_sort;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        if (arr.length <= 1) {
            return ;
        }

        //sorted area and unsorted area
        //start at the second item
        for (int i = 1; i < arr.length; i++) {
            //save current value
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > value) {
                    //move
                    arr[j+1] = arr[j];
                } else {
                    //value at right position
                    break;
                }
            }

            //insert
            arr[j+1] = value;
        }
    }
}
