import find_kth_max_numbers.QsortSolution;
import max_subarray.RecursiveSolution;

public class Test {
    public static void main(String[] args) {
        //findKthMaxNumbers(args);
        findMaxSubarray(args);
    }


    public static void findKthMaxNumbers(String[] args) {
        int[] arr = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }
        int k = Integer.valueOf(args[args.length - 1]);

        QsortSolution qss = new QsortSolution();
        int max = qss.findKthMaxNumber(arr, k, 0, arr.length - 1);

        System.out.println("the " + k + "th" +  " max number in ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println("is");
        System.out.println(max);
    }


    public static void findMaxSubarray(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }
        
        RecursiveSolution rs = new RecursiveSolution();
        int[] result = rs.find(arr, 0, arr.length - 1);

        System.out.println("the max subarray of input start at " + result[0] + " end at " + result[1] + " and the sum is " + result[2]);
    }
}
