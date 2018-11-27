package heap_sort;

public class HeapSort {


    void buildMaxHeap(int[] arr) {
        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, size, i);
        }
    }

    
    /**
     * using recursive and from top to bottom
     * */
    void maxHeapify(int[] arr, int size, int index) {
        int left = (index << 1) + 1;
        int right = (index << 1) + 2;
        int largest = index;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(arr, largest, index);
            maxHeapify(arr, size, largest);
        }

    }


    void topBottomHeapify(int[] arr, int size, int index) {

        while (true) {
            int largest = index;
            if (index * 2 <= size && arr[index * 2] > arr[index]) {
                largest = index * 2;
            }

            if (index * 2 + 1 <= size && arr[index * 2 + 1] > arr[largest]) {
                largest = index * 2 + 1;
            }

            if (largest != index) {
                swap(arr, largest, index);
                index = largest;
            }
        }
    }

    void bottomTopHeapify(int[] arr, int size, int index) {
        
    }

    void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


    public void heapSort(int[] arr) {
        buildMaxHeap(arr);

        for(int i = arr.length - 1; i >= 0; i--) {
            swap(arr, 0, i);
            maxHeapify(arr, i, 0);
        }
    }
}
