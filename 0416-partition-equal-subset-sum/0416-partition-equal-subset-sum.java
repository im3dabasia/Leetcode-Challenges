class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum =0;
        
        for(int i =0; i < nums.length ;i++){
            
            sum+=nums[i];
        }
        
        if(sum %2==1) return false;
        
        int[][] dp = new int[nums.length][sum/2 +1];
        
        for(int[] item: dp){
            Arrays.fill(item, -1);
        }
        
        return helper(nums, nums.length -1, sum/2, dp);
        
    }
    
    private boolean helper(int[] nums, int index, int target, int[][] dp){
        
        if(target == 0 )return true;
        
        if(index < 0 || index >= nums.length) return false;
        
        if(index == 0 && target == nums[0]) return true;
        if(index == 0 && target != nums[0]) return false;
        
        if(dp[index][target] != -1) return dp[index][target] == 0? false:true;
        boolean notPick = false || helper(nums, index -1, target, dp);
        
        boolean pick = false;
        
        if(nums[index] <= target){
            pick = false || helper(nums, index -1, target - nums[index], dp);
            dp[index][target] = pick || notPick ? 1:0;
            
        }
        
        return pick || notPick;
    }
}