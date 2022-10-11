class Solution {
    public void rotate(int[][] matrix) {
        
        int size = matrix.length;
        
        for(int i = 0; i <size ; i++){
            
            for(int j = i; j < size; j++){
                
               int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;            
            }
        }
        for(int j = 0; j < size; j++){
            reverse(matrix[j]);
        }
        
        
    }
        
    static void reverse(int[] arr){
        int len = arr.length -1;
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;

                len--;
            }
    } 
//         Approach 1 Bruteforce uses N2 space and N2 time 
//         int[][] res = new int[matrix.length][matrix.length];
//         int x = matrix.length -1;
//         int y = 0;
        
        
//         for (int i = 0; i < matrix.length; i++){
            
//             for (int j = 0; j < matrix.length; j++){
//                 res[y][x] = matrix[i][j];
//                 y++;
//             }
//             y = 0;
//             x--;
//         }
        
//         for ( int i = 0; i < matrix.length; i++){
            
//             for ( int j = 0; j < matrix.length; j++){
//                 matrix[i][j] = res[i][j];
//             }
//         }
        
        
        
        


}