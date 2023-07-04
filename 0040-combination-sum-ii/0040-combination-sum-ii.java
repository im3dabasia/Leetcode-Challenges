class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        
        Arrays.sort(nums);

        backTrack(nums,0, target, tmp, res);
        
        return res;
        
    }
    
    private void backTrack(int nums[],int index, int target, List<Integer> tmp, List<List<Integer>> res){
        
        // System.out.println(tmp + " " + target);
        if(target < 0){
            return;
        }
        else if(target == 0    ) res.add(new ArrayList<>(tmp));
        else{
            for(int i = index; i < nums.length; i++){
                if(i > index && nums[i] == nums[i-1]) continue; // skip duplicates

            
                tmp.add(nums[i]);
                backTrack(nums, i + 1, target - nums[i], tmp, res);
                tmp.remove(tmp.size() - 1);
            }
            
        }    

        
    }
}