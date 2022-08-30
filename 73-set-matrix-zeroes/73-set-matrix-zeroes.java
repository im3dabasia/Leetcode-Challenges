class Solution {
    public void setZeroes(int[][] matrix) {
        
        ArrayList<Integer> rowArr = new ArrayList<>();
        ArrayList<Integer> colArr = new ArrayList<>();
        
        //  lens 
        int rowLen = matrix[0].length;
        int colLen = matrix.length;
        
        
        for (int i = 0 ; i < colLen; i++){
            
            for (int k = 0; k < rowLen; k++){
                
                if (matrix[i][k] == 0){
                    
                    rowArr.add(i);
                    colArr.add(k);
                    
                }
            }
        }
        
        //Now iterate through the rowArr and colArr if value found then reinit to 0
        
        for(int i = 0; i < colLen; i++){
            
            for(int k = 0; k < rowLen; k++){
                
                if(rowArr.contains(i) || colArr.contains(k)){
                    
                    matrix[i][k] = 0;
                    
                }
            }
        }
        
        
        
    }
}