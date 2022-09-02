class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){
            
            for(int j = 0; j < matrix[0].length; j++){
                
                if( matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    
    }
}


//         int rowLen = matrix[0].length - 1;
//         boolean ans = true;
        
//         for(int i = 0; i < matrix.length; i++){
            
//             if( target >= matrix[i][0]  && target <= matrix[i][rowLen]){
                
//                 ans = binarySearch(matrix[i], target);
                    
//             }
//         }
//         return ans;
//     }
    
//     public boolean  binarySearch(int[] nums, int tar){
        
//         int low = 0;
//         int high = nums.length - 1;
        
//         while(low < high){
            
//             int mid = (low + high) / 2;
            
//             if(tar < mid){
                
//                 high = mid - 1;
                
//             }
//             else if(tar > mid){
                
//                 low = mid + 1;
                
//             }
//             else if(tar == mid){
                
//                 return true;
                
//             }
            
            
//         }
        
//         return false;