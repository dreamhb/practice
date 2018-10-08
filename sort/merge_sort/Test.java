public class Test {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }

        Mergesort ms = new Mergesort();
        ms.mergesort(arr, 0, arr.length - 1);
        
        System.out.println("result: ");
        for (int k: arr) {
            System.out.print(k + " ");
        }
        System.out.println("");
    }
}
