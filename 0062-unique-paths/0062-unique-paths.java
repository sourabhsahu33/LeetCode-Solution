class Solution {
    // Recurence approach -> 
    // public int uniquePaths(int m, int n) {
    //     return f(m-1, n-1);
    // }
    // public int f(int i, int j){
    //     if(i==0 && j==0) return 1;
    //     if(i < 0 || j< 0) return 0;

    //     int up = f(i-1, j);
    //     int left = f(i, j-1);

    //     return up+left;
    // }

// Memoization approach top-down 
// public int uniquePaths(int m, int n) {
//         int dp[][] = new int[m+1][n+1];
//         for(int row[] : dp ){
//             Arrays.fill(row, -1);
//         }
//         return f(m-1, n-1, dp);
//     }
//     public int f(int i, int j, int dp[][]){
//         if(i==0 && j==0) return 1;
//         if(i < 0 || j< 0) return 0;
//         if(dp[i][j] != -1) return dp[i][j];

//         int up = f(i-1, j, dp);
//         int left = f(i, j-1, dp);

//         return dp[i][j] =up+left;
//     }

// Tabeulation approach Bottom-up Apporach 
// public int uniquePaths(int m, int n) {
//     int[][] dp = new int[m][n];
    
//     // Initialize the starting point
//     dp[0][0] = 1;

//     for (int i = 0; i < m; i++) {
//         for (int j = 0; j < n; j++) {
//             if (i > 0) {
//                 dp[i][j] += dp[i - 1][j]; // Move down
//             }
//             if (j > 0) {
//                 dp[i][j] += dp[i][j - 1]; // Move right
//             }
//         }
//     }

//     return dp[m - 1][n - 1];
//   }

        public int uniquePaths(int m, int n){
           int N = n + m - 2;
            int r = m - 1; 
            double res = 1;
            
            for (int i = 1; i <= r; i++)
                res = res * (N - r + i) / i;
            return (int)res;
        }
}

