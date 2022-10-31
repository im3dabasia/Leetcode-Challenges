class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        if(matrix[0].length <= 1){
            return true;
            }
        
        for(int i = 0; i < matrix.length ; i++){
            
            for(int j = 0 ; j < matrix[0].length ; j++){
                
                if(i > 0 && j > 0 ){
                    // System.out.println( i +" " + j +"...." + matrix[i - 1][j - 1] + " " + matrix[i][j]   );
                    
                }
                
                if(i > 0 && j > 0 && matrix[i - 1][j - 1] != matrix[i][j]  ){
                    return false;
                }
            }
        }
        
        return true;
    }
    
}