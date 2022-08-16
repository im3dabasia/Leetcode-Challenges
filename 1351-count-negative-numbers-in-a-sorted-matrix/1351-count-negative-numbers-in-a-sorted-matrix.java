class Solution {
    public int countNegatives(int[][] grid) {
        
        int cnt = 0;
        for (int i = 0; i < grid.length; i++){
            
            for (int y = 0; y < grid[i].length; y++){
                
                if(grid[i][y] < 0){
                    cnt++;
                }
            }
        }
        
        return cnt;
        
    }
}