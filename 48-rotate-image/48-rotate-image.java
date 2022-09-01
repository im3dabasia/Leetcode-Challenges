class Solution {
    public void rotate(int[][] matrix) {
        
        int num = matrix[0].length/2;
        
        transposeMatrix(matrix);
        reflectionMatrix(matrix, num);
        
        }
            
        public void transposeMatrix(int[][] matrix){
            
            for( int i = 0; i < matrix.length; i++){
                
                for(int j = i + 1; j < matrix.length; j++){
                    
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                    
                }
                
            }
            
        }
        
        public void reflectionMatrix(int[][] matrix, int num){
            
            int n =  matrix.length;
            
            for (int i = 0; i < n; i++ ){
                
                for( int j = 0; j < num; j++){
                    
                    int temp = matrix[i][j];
                    // matrix[i][n - 1 - j] = matrix[i][j];
                    matrix[i][j] = matrix[i][n -1 - j];
                    matrix[i][n -1 - j] = temp;
                
                }
            }
            
        }
    
}
