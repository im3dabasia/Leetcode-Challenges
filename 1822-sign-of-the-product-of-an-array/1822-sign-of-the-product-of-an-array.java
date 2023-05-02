class Solution {
    public int arraySign(int[] nums) {
        
        double ans = 1;
        
        for(int i = 0; i < nums.length; i++){
        ans = ans * nums[i];
            
        }
        
        if(Float.isNaN( (float)ans))return 0;
        if(ans > 0) return 1;
        else if(ans == 0) return 0;
        else return -1;
    }
}