class Solution {
    public boolean canJump(int[] nums) {
        
        int limit = nums.length - 1;
        
        for(int i = limit - 1; i >= 0; i--){
            
        System.out.println(limit);
            
            if((i + nums[i])  >= limit){
                limit = i;
            }
        }
        if(limit == 0) return true;
        return false;
        
    }
}

