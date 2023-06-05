class Solution {
    public void setZeroes(int[][] matrix) {
        
        int col0 = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i = 0; i <  rows; i++){
            
            for(int j = 0; j < cols; j++){
                
                
                if( matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    // matrix[0][j] = 0;
                    
                    if (j != 0)
                        matrix[0][j] = 0;
                    
                    else
                        col0 = 0;
                    }
                    
                }
            }
        
        
        for(int i = rows -1; i > 0; i-- ){
            for(int j = cols - 1; j > 0; j--){
                // System.out.println(i + " " + j);
                
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                // System.out.println("hel");
                    
                }
                
            }
        }
        
        if(matrix[0][0] == 0){
            
                // System.out.println("hel");
            
            for(int i = 1; i < cols; i++){
                matrix[0][i] =0;
            }
        }
        
        if(col0 == 0){
            
            for(int i = 0; i < rows; i++){
                matrix[i][0] =0;
            }
        }
        
    }
}