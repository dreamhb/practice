public class HeapSort {

    void buildMaxHeap(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }

    void maxHeapify(int[] arr, int index) {
        int left = left(index);
        int right = right(index);
        int largest = -1;

        if (left <= arr.heapSize && arr[left] > arr[index]) {
            largest = left;
        } else {
            largest = index;
        }

        if (right <= arr.heapSize && arr[right] > arr[index]) {
            largest = right;
        }

        if (largest != index) {
            swap(arr[largest], arr[index]);
            maxHeapify(arr, index);
        }

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
