class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backTracker(nums, new ArrayList<>(), 0);
        
        
        return res;
    }
    private void backTracker(int[] nums, ArrayList<Integer> temp,int index){
        if(nums.length == index){
            
            res.add(new ArrayList<>(temp));
            return;
            
        }
        
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backTracker(nums, temp, index + 1);
            temp.remove(temp.size() -1);
        }

        
    }
}