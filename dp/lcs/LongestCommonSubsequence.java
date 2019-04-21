public class LongestCommonSubsequence {
    
    /**
     * return longest common subsequence's length
     * */

    int lcs(char[] X, char[] Y, int m, int n) {
        int[][] Z = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    Z[i][j] = 0;
                } else if (X[i-1] == Y[j-1]) {
                    Z[i][j] = Z[i-1][j-1] + 1;
                } else {
                    Z[i][j] = max(Z[i-1][j], Z[i][j-1]);
                }
            }
        }

        return Z[m][n];
    }


    int max(int a, int b) {
        return a > b ? a : b;
    }
}
