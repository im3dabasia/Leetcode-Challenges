class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int i =0;
        
        long ans = 0;
        long cnt =0;
        while(i < nums.length){
            
            
            if(nums[i] == 0){
                cnt++;
                ans += cnt;
            }else{
                cnt = 0;
            }
            i++;
            
        }
        return ans;
    }
}