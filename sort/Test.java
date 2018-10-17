import bubble_sort.BubbleSort;

public class Test {
    public static void main(String[] args) {
        int[] arr = getFromInput(args);
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);

        print(arr);
    }


    public static void print(int[] arr) {
        System.out.println("bubble sort result: ");
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
