import find_kth_max_numbers.QsortSolution;

public class Test {
    public static void main(String[] args) {
        findKthMaxNumbers(args);
    }


    public static void findKthMaxNumbers(String[] args) {
        int[] arr = new int[args.length - 2];
        for (int i = 0; i < args.length - 2; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }
        int k = Integer.valueOf(args[args.length - 1]);

        QsortSolution qss = new QsortSolution();
        int max = qss.findKthMaxNumber(arr, k, 0, arr.length - 1);

        System.out.println("the kth max number is " + max);
    }
}
