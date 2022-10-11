class Solution {
    public void rotate(int[][] matrix) {
        
        int[][] res = new int[matrix.length][matrix.length];
        int x = matrix.length -1;
        int y = 0;
        
        
        for (int i = 0; i < matrix.length; i++){
            
            for (int j = 0; j < matrix.length; j++){
                res[y][x] = matrix[i][j];
                y++;
            }
            y = 0;
            x--;
        }
        
        for ( int i = 0; i < matrix.length; i++){
            
            for ( int j = 0; j < matrix.length; j++){
                matrix[i][j] = res[i][j];
            }
        }
        
    }
}