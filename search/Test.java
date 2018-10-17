import binary_search.BinarySearch;

public class Test {
    static int[] arr;

    /**
     * last one in the input is the number
     * we want u to search
     *
     * */
    public static void main(String[] args) {
        arr = getFromInput(args);

        int result = binarySearch(Integer.valueOf(args[args.length - 1]));

        System.out.println("The index of your input number is: " + result);
    }


    public static int binarySearch(int number) {
        BinarySearch bs = new BinarySearch();
        return bs.search(arr, number);
    }

    public static int[] getFromInput(String[] args) {
        int[] arr = new int[args.length - 1];
        int index = 0;
        for (String s: args) {
            if (arr.length == index) {
                break;
            }
            arr[index] = Integer.valueOf(s);
            index++;
        }
        return arr;
    }

}
