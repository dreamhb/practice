import java.util.*;

public class Knapsack {

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * brute force
     *
     * */
    static int knapsack(int W, int[] w, int[] v, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (w[n-1] > W) {
            return knapsack(W, w, v, n-1);
        } 

        return max(
                knapsack(W, w, v, n-1),
                v[n-1] + knapsack(W - w[n-1], w, v, n-1)
                );
    }


    /**
     * dynamic programming top down
     *
     * Memoization
     *
     * */
    private static int knapsackTD(int W, int[] w, int[] v) {
       int[][] m = new int[v.length+1][W+1]; 
       for (int i = 0; i <= v.length; i++) {
           m[i][0] = 0; 
       }
       for (int i = 0; i <= W; i++) {
           m[0][i] = 0; 
       }

       return knapsackTdAux(v.length, W, w, v, m);
    }

    private static int knapsackTdAux(int i, int W, int[] w, int[] v, int[][] m) {
        if (W <= 0 || i <= 0) {
            return 0;
        }

        if (m[i][W] > 0) {
            return m[i][W];
        }

        int max = 0;

        for (int j = 1; j < i; j++) {
            max = max(max, v[j] + knapsackTdAux(i-j, W-w[j], w, v, m));
        }
        m[i][W] = max;
        return max;
    }


    /**
     * dynamic programming bottom up
     * 1.find optimal structure
     * 2.form an equation
     * 3.write recursive version
     * 4.convert to bottom-up version
     *
     * @param v is value array
     * @param w is weight array
     * @param W is the capacity
     * */
    private static int knapsackBU(int W, int[] w, int[] v) {
        //
        int[][] M = new int[v.length][W+1];

        for (int i = 1; i < v.length; i++) {
            M[i][0] = 0;
        }

        for (int j = 0; j <= W; j++) {
            M[0][j] = 0;
        }

        //get max value equal to or less than j and the first i items
        for (int i = 1; i < v.length; i++)
            for (int j = 0; j <= W; j++) {
                if (w[i] > j) {
                    //don't include ith item, using previous max value
                    M[i][j] = M[i-1][j];
                } else {
                    M[i][j] = max(
                            M[i-1][j], //exclude ith item
                            M[i-1][j - w[i]] + v[i]//include ith item
                            );
                }

            }
        return M[v.length-1][W];
    }

    public static void main(String[] args) {
        int[] v = new int[]{160, 100, 120, 80};
        int[] w = new int[]{10, 20, 30, 10};
        int W = 20;
        int n = v.length;
        System.out.println(knapsackBU(W, w, v));
    }
}
