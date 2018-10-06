public class Test {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int i = 0;
        for (String s: args) {
            arr[i] = Integer.valueOf(s);
            i++;
        }

        Quicksort qs = new Quicksort();
        qs.quicksort(arr, 0, arr.length - 1);

        printResult(arr);
    }


    public static void printResult(int[] arr) {
        System.out.println("result: ");
        for (int i: arr) {
            System.out.print( i + " ");
        }
        System.out.println("");
    }
}
