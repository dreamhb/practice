public class HeapSort {

    int heapSize = 0;

    void buildMaxHeap(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    void maxHeapify(int[] arr, int index) {
        int left = index << 1;
        int right = index << 1 + 1;
        int largest;

        if (left <= heapSize && arr[left] > arr[index]) {
            largest = left;
        } else {
            largest = index;
        }

        if (right <= heapSize && arr[right] > arr[index]) {
            largest = right;
        }

        if (largest != index) {
            heapSize++;
            swap(arr, largest, index);
            maxHeapify(arr, index);
        }

    }


    void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


    public void heapSort(int[] arr) {
        buildMaxHeap(arr);
        int heapSize = arr.length;
        for(int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            heapSize = heapSize - 1;
            maxHeapify(arr, 0);
        }
    }
}
