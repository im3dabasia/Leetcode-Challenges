class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backTracker(nums, new ArrayList<>());
        
        return res;
    }
    private void backTracker(int[] nums, ArrayList<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        else{
            
            for(int i = 0; i < nums.length; i++){
                
                if(temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                backTracker(nums, temp);
                temp.remove(temp.size() - 1);
            }
            
        }

    }
}