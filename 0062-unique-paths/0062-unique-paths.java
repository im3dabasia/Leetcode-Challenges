class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i =0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
        
        // return helper(m - 1,n -1,dp);
        
        for(int i = 0 ; i < m; i++){
            
            for(int j = 0 ; j < n; j++){
                
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                
                int up = 0;
                int left = 0;
                if(i -1 >= 0)  up = dp[i -1][j];
                if(j -1 >= 0)  left = dp[i][j -1];
                dp[i][j] = up + left;
            }
        }
        return dp[m-1][n-1];
        
    }
    
//     private int helper(int r, int c, int[][] dp){
        
//         if(r == 0 && c == 0) return 1;
//         if(r < 0 || c < 0 )return 0;
        
//         if(dp[r][c] != -1) return dp[r][c];
        
//         int up = helper(r - 1, c, dp);
//         int left = helper(r, c - 1, dp);
        
//         return dp[r][c] =  up + left;
//     }
}

// Time = 0(2^(m * n)) every box will have 2 options to go left and right and there are m * n boxes
// Space = 0(dp array + recursion stack space)