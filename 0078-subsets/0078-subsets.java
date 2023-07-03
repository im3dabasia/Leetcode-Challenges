class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res  = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTrack(res, temp, nums, 0);
        
        return res;
        
    }
    private void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int start){
        
        res.add(new ArrayList<>(temp));
        
        for(int i = start; i < nums.length; i++ ){
            if(i > start && nums[i] == nums[i -1]) continue;
            
            temp.add(nums[i]);
            backTrack(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}