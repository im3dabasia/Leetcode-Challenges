class Solution {
    public int minPathSum(int[][] grid) {
        
        if (grid.length == 1 && grid[0].length == 1) return grid[0][0];
        
        int n = grid.length;
        int m = grid[0].length;
        int dp[][]=new int[n][m];
        
        for(int row[]: dp)
            Arrays.fill(row,-1);
        int a = helper(n - 1, m -1, grid, dp);
        
        return dp[n -1][m -1];
        
    }
    
    private int helper(int row, int col , int[][] grid, int[][] dp){
        
        if( row == 0 && col == 0) return  grid[0][0];
        if( row < 0 || col < 0) return 100000;
        
        if(dp[row][col]!=-1) return dp[row][col];

        
        int left = grid[row][col] + helper(row , col-1, grid, dp);
        int up = grid[row][col] + helper(row -1 , col, grid, dp);
        
        return dp[row][col] =Math.min(left, up);
        
    }
}