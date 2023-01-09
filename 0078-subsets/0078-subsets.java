class Solution {
    List<List<Integer>> output;
    
    public List<List<Integer>> subsets(int[] nums) {
        
        output = new ArrayList<>();
        
        if(nums == null || nums.length == 0)return output;
        
        helper( nums, new ArrayList<Integer>(), 0);
        return output;
        
  }
    private void helper(int[] nums, List<Integer> temp, int index){
        
        if(index >= nums.length){
            output.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[index]);
        helper(nums,temp, index + 1);
        
        temp.remove(temp.size() - 1);
        
        helper(nums, temp, index + 1);
    }
}