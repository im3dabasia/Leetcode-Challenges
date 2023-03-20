class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        List<List<Integer>> dp = new ArrayList<>();
        for(int i = 0 ; i < triangle.size() ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < i+1; j++){
                temp.add(-1);
            }
            dp.add(new ArrayList<>(temp));  
            
        }
        // System.out.println(dp);
        int a =  helper(0, 0, triangle,dp );
        
        // System.out.println(dp);
        return a;
    }
    
    private int helper(int row, int col , List<List<Integer>> triangle, List<List<Integer>> dp){
        
        if(row > triangle.size()- 1|| col > triangle.get(row).size() - 1) return 0;
        
        if(dp.get(row).get(col) != -1) return dp.get(row).get(col);
        
        int left = triangle.get(row).get(col) + helper(row + 1, col, triangle, dp);
        int right = triangle.get(row).get(col) + helper(row + 1, col + 1, triangle, dp);
        
        dp.get(row).set(col,  Math.min(left, right));
        return  Math.min(left, right);
        
    }
}