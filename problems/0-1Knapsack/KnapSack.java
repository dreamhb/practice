public class KnapSack {
    static int max(int a, int b) {
        return a > b ? a : b;
    }


    static int knapSack(int W, int[] wt, int[] val, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n-1] > W) {
            return knapSack(W, wt, val, n-1);
        } 

        return max(
                knapSack(W, wt, val, n-1),
                val[n-1] + knapSack(W - wt[n-1], wt, val, n-1)
                );


    }

    public static void main(String[] args) {
        int val[] = new int[]{160, 100, 120, 80};
        int wt[] = new int[]{10, 20, 30, 10};
        int W = 10;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
