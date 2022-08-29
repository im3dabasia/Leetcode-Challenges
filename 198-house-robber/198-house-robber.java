class Solution {
    
    public int rob(int[] nums) {
        
        int prev = 0;
        int prev2 = 0;
        
        for(int i = 0;i < nums.length; i++){
            
            int max = 0;

            int notpick = prev;
            int pick = nums[i] + prev2;
            
            int curr = Math.max(pick, notpick);
            
            prev2 = prev;   
            prev = curr;
            
        }
        
        return prev;
    }
}