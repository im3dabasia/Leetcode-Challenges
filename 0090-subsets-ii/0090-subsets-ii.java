class Solution {
    List<List<Integer>> output = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        printf(0, nums);
        
        return output;
        
    }
    
    private void printf(int index, int[] nums){
        
        output.add(new ArrayList<Integer>(temp) );
        
        if(index == nums.length) {
            return;
            
        }
        
        for( int i = index; i < nums.length; i++ ){
            
            
            if(i != index && nums[i] == nums[i - 1]) continue;
            
            temp.add(nums[i]);
            printf(i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}