package excercise;

import java.util.Arrays;

public class UniquePaths {


    public static void main(String[] args) {

        int m = 51;
        int n=9;

        //System.out.println(countSubPaths(51,9));
        int[][] dp = new int[m][n];

        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp)
            Arrays.fill(row, -1);

        //System.out.println(countSubPathsTopDown(m-1,n-1,dp));
        System.out.println(countSubPathsBottomUp(m,n,dp));

    }

    static  int countSubPathsTopDown(int m,int n,int[][] dp){
        if(m==0 || n ==0){
            return 1;
        }
        if(m < 0 || n < 0){
            return 0;
        }

        if(dp[m][n] != -1){
            return dp[m][n];
        }

        int up = countSubPaths(m-1,n);
        int left = countSubPaths(m,n-1);

        return dp[m][n] =  up+left;
    }

    //using recursion
    static  int countSubPaths(int m,int n){
        if(m==0 || n ==0){
            return 1;
        }
        if(m < 0 || n < 0){
            return 0;
        }

        int up = countSubPaths(m-1,n);
        int left = countSubPaths(m,n-1);

        return up+left;
    }


    static  int countSubPathsBottomUp(int m,int n,int[][] dp){
        // Loop through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Base condition: If we are at the top-left cell (0, 0), there's one way to reach it.
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Calculate the number of ways by moving up (if possible) and left (if possible)
                if (i > 0)
                    up = dp[i - 1][j];
                if (j > 0)
                    left = dp[i][j - 1];

                // Store the total number of ways to reach the current cell in the DP array
                dp[i][j] = up + left;
            }
        }

        // Return the number of ways to reach the bottom-right cell (m-1, n-1)
        return dp[m - 1][n - 1];
    }



}
