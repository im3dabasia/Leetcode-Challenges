class Solution {
    public int diagonalSum(int[][] mat) {
              int len = mat.length;
        
        int sum = 0;
        
        for (int i = 0; i < len; i++ ){
                
            sum += mat[i][i];
            sum += mat[i][len - 1 - i ];

                
        }
        if (len % 2 == 0){
            return sum;
    }
        return sum - mat[(int) len/2][(int) len/2 ];
        
    }
}