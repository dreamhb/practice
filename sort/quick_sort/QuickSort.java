public class Quicksort {
    
    public void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quicksort(arr, left, pivot);
            quicksort(arr, pivot + 1, right);
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
}
