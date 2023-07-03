class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        helper(0, nums, new ArrayList<>(), res);
        return res;
        
    }
    
    private void helper(int index, int nums[], List<Integer> tmp, List<List<Integer>> res){
        
        if(index == nums.length){
            res.add(new ArrayList<>(tmp));
            return;
        }
        
        tmp.add(nums[index]);
        helper(index + 1, nums, tmp, res);
        tmp.remove(tmp.size() - 1);
        helper(index + 1, nums, tmp, res);
        
    }
}