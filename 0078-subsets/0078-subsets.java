class Solution {
    List<List<Integer>> output = new ArrayList();
    List<Integer> tempList = new ArrayList();
    
    
    public List<List<Integer>> subsets(int[] nums) {
        
        printf(0, nums);
        
        return output;
  }
    
    private void printf(int indx, int[] nums){
        
        output.add( new ArrayList<Integer>(tempList) );
        
        if(indx == nums.length ){
            
            return ;
        }
        
        
        for(int i = indx; i < nums.length; i++ ){
            
        tempList.add(nums[i]);
        printf(i + 1, nums);
                
        tempList.remove( tempList.size() - 1);
            
            
        }
        return;
        

    }
    
}