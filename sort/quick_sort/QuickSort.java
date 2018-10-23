package quick_sort;

public class QuickSort {
    
    boolean originalPartition = false;
    public void quicksort(int[] arr, int left, int right) {
        if (left < right) {

            if (originalPartition) {
                int pivot = partition(arr, left, right);

                quicksort(arr, left, pivot);
                quicksort(arr, pivot + 1, right);
            } else {
                int pivot = lPart(arr, left, right);
                quicksort(arr, left, pivot - 1);
                quicksort(arr, pivot + 1, right);
            }
        }
    }


    public int partition(int[] arr, int left, int right) {
        //choose a pivot
        int pivot = arr[left];

        int i = left - 1;
        int j = right + 1;
        while(true) {
            do {
                i++;
            } while(arr[i] < pivot);

            do {
                j--;
            } while(arr[j] > pivot);

            //means all items have swaped
            if (i >= j) {
                return j;
            }

            //arr[i] > pivot & arr[j] < pivot
            //swap them
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    private int lPart(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

                i++;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        
        return i;
    }
}
