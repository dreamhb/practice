package bubble_sort;

public class BubbleSort {
    
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swaped = true;
                }
                
            }

            if (!swaped) {
                break;
            }
        }
    }
}
