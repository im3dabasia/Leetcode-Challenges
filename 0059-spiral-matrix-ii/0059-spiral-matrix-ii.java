class Solution {
    public int[][] generateMatrix(int n) {

        return helper(n);
    }


private int[][] helper(int n ) {

    int minR = 0;
    int minC = 0;

    int maxR = n -1;
    int maxC = n- 1;
    int total = n  * n ;

    int count = 0;
    
    int[][] matrix = new int[n][n];

    List<Integer> res = new ArrayList<>();

    while(count < total){

        //top
        for(int i = minC; i <= maxC && count < total; i++){
            // count++;
            
            matrix[minR][i] = ++count;
            // res.add(matrix[minR][i]);

        }
        minR++;

        //right
        for(int i = minR; i <= maxR && count < total; i++){  
            // count++;
            matrix[i][maxC] = ++count;
            
            // res.add(matrix[i][maxC]);

        }
        maxC--;

        //bottom        
        for(int i = maxC ; i >= minC && count < total; i--){
            // count++;
            // res.add(matrix[maxR][i ] );
            matrix[maxR][i ] = ++count;
            

        }
        maxR--;

        //left
        for(int i = maxR ; i >= minR && count < total; i--){
            // count++;
            // res.add(matrix[i][minC]);
            matrix[i][minC] = ++count;

        }
        minC++;

    }
    
    return matrix;

    }
}
    