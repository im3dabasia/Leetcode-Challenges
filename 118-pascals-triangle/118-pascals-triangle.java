class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ansArr = new  ArrayList<>();
        
        List<Integer> prev = new  ArrayList<>();
        
        prev.add(1);
        
        ansArr.add(prev);
        
        
        //  for the rest of the triangle ie from second iteration onwards
        for(int k = 2; k <= numRows; k++){
            
            
            List<Integer> curr = new  ArrayList<>();
            curr.add(1);
            
            for(int y = 0; y < prev.size() - 1; y++){
                
                curr.add(prev.get(y) + prev.get(y + 1));
                
            }
            
            curr.add(1);
            
            prev = curr;
            ansArr.add(curr);   

        }
        return ansArr;            
        
    }
}

