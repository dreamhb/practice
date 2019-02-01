public class Knapsack {
    static int max(int a, int b) {
        return a > b ? a : b;
    }


    /**
     * brute force
     *
     * */
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


    /**
     * dynamic programming bottom up
     *
     * */
    private static int knapsackBU(int[] v, int[] w, int W) {
        int[][] M = new int[v.length+1][W+1];

        //get max value equal to or less than j and the first i items
        for (int i = 1; i <= v.length; i++)
            for ( int j = 0; j <= W; j++) {
                
                if (w[i-1] > j) {
                    //don't include ith item, using previous max value
                    M[i][j] = M[i-1][j];
                } else {
                    M[i][j] = max(M[i-1][j], //exclude ith item
                            M[i-1][j - w[i-1]] + v[i-1]);//include ith item
                }

            }
        return M[v.length][W];
    }
    

    /**
     * dynamic programming top down
     *
     * */
    private static int knapsackTB(int[] v, int[] w, String key, Map<String, Integer> lookup) {
        
    }

    public static void main(String[] args) {
        int val[] = new int[]{160, 100, 120, 80};
        int wt[] = new int[]{10, 20, 30, 10};
        int W = 10;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
    }
}
