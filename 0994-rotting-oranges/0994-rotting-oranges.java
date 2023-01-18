class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;        
        int freshOranges = 0;
        
        for(int i = 0 ; i < rows; i++){
            
            for(int j = 0 ; j < cols; j++){
                
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                
                if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
            
        
        }
        System.out.println(freshOranges);
        
        if(freshOranges == 0) return 0;
        
        int minutes = -1;
        
        while(!q.isEmpty()){
            
            int qSize = q.size();
            
            for(int i = 0; i < qSize; i++){
                
                int[] orangeLoc = q.poll();
                int row = orangeLoc[0];
                int col = orangeLoc[1];
                
                    if( row + 1 < rows && grid[row+1][col] ==1 ){
                        grid[row + 1][col] = 2;  
                        q.add(new int[]{row+1,col});
                        freshOranges--;
                    } 
                    if( row - 1 >= 0 && grid[row - 1][col] ==1){
                        grid[row - 1][col] = 2;
                        q.add(new int[]{row-1,col});
                        freshOranges--;
                        
                    } 
                    if( col + 1 < cols && grid[row][col + 1] ==1){
                        grid[row][col + 1] = 2;  
                        q.add(new int[]{row,col+1});
                        freshOranges--;
                        
                    } 
                    if( col - 1 >= 0 && grid[row][col - 1] ==1){
                        grid[row][col - 1] = 2; 
                        q.add(new int[]{row,col-1});
                        freshOranges--;
                        
                    } 
            }
            minutes++;
        }
        System.out.println(freshOranges);
        return freshOranges==0? minutes: -1;
    }
}