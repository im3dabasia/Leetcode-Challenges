class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int minR = 0;
        int minC = 0;
        
        int maxR = matrix.length -1;
        int maxC = matrix[0].length - 1;
        int total = (maxR+1) * (1+maxC);
        
        int count = 0;
        
        List<Integer> res = new ArrayList<>();
        
        while(count < total){
            
            //top
            for(int i = minC; i <= maxC && count < total; i++){
                res.add(matrix[minR][i]);
                count++;

            }
            minR++;
            // System.out.println("1" + res + " " + minR + " " + maxR);

            //right
            for(int i = minR; i <= maxR && count < total; i++){                
                res.add(matrix[i][maxC]);
                count++;

            }
            maxC--;
            // System.out.println("2" + res);

            //bottom        
            // System.out.println("hello" + maxR + " " + maxC );
            
            for(int i = maxC ; i >= minC && count < total; i--){
            // System.out.println(matrix[maxR][i] );
                
                res.add(matrix[maxR][i ] );
                count++;

            }
            maxR--;
            // System.out.println("3" + res);
            

            //left
            for(int i = maxR ; i >= minR && count < total; i--){
                res.add(matrix[i][minC]);
                count++;

            }
            minC++;
            // System.out.println("4" + res);
            
        }
            
        return res;
    }
}