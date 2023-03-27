class Solution {
    List<Integer> temp ;
    public int minPathSum(int[][] grid) {
        temp = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        
        int[][] dp = new int[rows][cols];
        
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(grid, rows -1, cols -1, dp);
    }
    
    private int helper(int[][] grid, int row, int col, int[][] dp){

        if( row == 0 && col == 0) return  grid[0][0];
        
        if(row < 0 || col < 0) return (int)Math.pow(10,9);

        if(dp[row][col]!=-1) return dp[row][col];
        // System.out.println(row + " " + col);
    
        int left = grid[row][col] + helper(grid, row, col - 1, dp);
        int up = grid[row][col] + helper(grid, row - 1, col, dp);
        
        return dp[row][col] =  Math.min(left, up);
        
        
    }
}

//reccurence relatiion 
