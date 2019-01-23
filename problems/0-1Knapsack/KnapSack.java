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

    private static int knapSackDP(int W, int wt[], int val[], int n) {
        int i, w;
        int[][] V = new int[n+1][W+1];
        
        for (i = 0; i < n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    V[i][w] = 0;
                } else if (wt[i-1] <= w) {
                    V[i][w] = max(val[i-1] + V[i-1][w - wt[i-1]], V[i-1][w];
                } else {
                    V[i][w] = V[i-1][w];
                }
            }
        }
    }

    public static void main(String[] args) {
        int val[] = new int[]{160, 100, 120, 80};
        int wt[] = new int[]{10, 20, 30, 10};
        int W = 10;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
