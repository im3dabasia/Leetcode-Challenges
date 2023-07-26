class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        
        backtracker(res, temp, nums);
        return res;
        
    }
    private void backtracker(List<List<Integer>> res, List<Integer> temp, int[] nums){
        
        if(temp.size() == nums.length){
            
            res.add(new ArrayList<>(temp));
        }
        else{
        
            for(int i = 0 ; i < nums.length; i++){
                if(temp.contains(nums[i])) continue;

                temp.add(nums[i]);
                backtracker(res, temp, nums);
                temp.remove(temp.size() - 1);
            }    
        }
        
    }
}