public class HeapSort {
    void buildMaxHeap(int[] arr) {
    
    }

    void maxHeapify(int[] arr, int index) {
    
    }


    public void heapSort(int[] arr) {
        buildMaxHeap(arr);
        int heapSize = arr.length;
        for(int i = arr.length - 1; i > 0; i--) {
            swap(arr[0], arr[i]);
            heapSize = heapSize - 1;
            maxHeapify(arr, 0);
        }
    }
}
