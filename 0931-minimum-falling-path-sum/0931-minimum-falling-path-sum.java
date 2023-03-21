class Solution {
    public int minFallingPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int ans = Integer.MAX_VALUE;
        
        int[][] dp = new int[m][n];
        
        for(int[] indArr: dp){
            Arrays.fill(indArr , -1);
        }
//         for(int i = 0; i < m; i++){
//             for(int j = 0 ; j < n; j++){
//                 System.out.print(dp[i][j]);
//             }
            
//             System.out.println("");
//         }
        
        for(int i = 0 ; i < n; i++){
            int tempAns = helper(grid, m -1, i, dp );
            // System.out.println(tempAns);
            ans = Math.min(tempAns, ans);
            
        }
        return ans;
        
    }
    
    private int helper(int[][] grid, int row, int col, int[][] dp){
        // System.out.println(row + " " + col);
        
        if(col < 0 || col >= grid[0].length) return 100000;
        if(row == 0) return grid[0][col];
        
        if(dp[row][col] != -1) return dp[row][col];
        
        int up = grid[row][col] + helper(grid, row - 1, col, dp);
        int uRight = grid[row][col] + helper(grid, row - 1, col + 1, dp);
        int uLeft = grid[row][col] + helper(grid, row- 1, col - 1, dp);

        // System.out.println("up " + up + " uRight " + uRight + " uLeft " + uLeft);
        return dp[row][col] =  Math.min(up, Math.min(uRight, uLeft));
        
        
    }
}