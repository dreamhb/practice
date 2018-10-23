import quick_sort.QuickSort;
import bubble_sort.BubbleSort;
import insertion_sort.InsertionSort;
import selection_sort.SelectionSort;

public class Test {

    static int[] arr;
    public static void main(String[] args) {
        arr = getFromInput(args);
        quickSort();
        print(arr);
    }

    public static void quickSort() {
        QuickSort qs = new QuickSort();
        qs.quicksort(arr, 0, arr.length - 1);
    }

    public void bubbleSort() {
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
    }

    public static void insertionSort() {
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
    }

    public static void selectionSort() {
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
    }


    public static void print(int[] arr) {
        System.out.println("sort result: ");
        for (int i: arr) {
            System.out.println(i + " " );
        }
        System.out.println("");

    }

    public static int[] getFromInput(String[] args) {
        int[] arr = new int[args.length];
        int index = 0;
        for (String s: args) {
            arr[index] = Integer.valueOf(s);
            index++;
        }
        return arr;
    }

}
