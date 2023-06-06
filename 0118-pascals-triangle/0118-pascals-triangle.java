class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        
        for ( int i = 1; i <= numRows ;i++){
            
            List<Integer> tmp = new ArrayList<>();
            int num = 1;
            for(int j = 1; j <= i; j++){
                
                if(j == 1 || j == i){
                    tmp.add(1);
                    
                }else{
                    // System.out.println(i + " "  +j);
                    
                    num = num * ( i  - (j - 1));
                    num = num / (j - 1);
                    tmp.add(num);
                }
            }
            
            res.add(new ArrayList<>(tmp));
        }
        
        return res;
        
        
    }
}