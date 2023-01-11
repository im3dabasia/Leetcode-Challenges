class Solution {
    
    List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backTracker(nums, new ArrayList<>() , used);
        return res;
    }
    
    private void backTracker(int[] nums, List<Integer> temp, boolean[] used){
        
        if(temp.size() == nums.length){
            
            if(!res.contains(temp)){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        else{
            
            for(int i = 0; i < nums.length; i++){
                if(used[i] || (i > 0 && nums[i] == nums[i-1] && !used[i - 1])) continue;
                
                temp.add(nums[i]);
                used[i] = true;
                backTracker(nums, temp, used);
                used[i] = false;
                temp.remove(temp.size() - 1);
                
            }
        }
    }
}