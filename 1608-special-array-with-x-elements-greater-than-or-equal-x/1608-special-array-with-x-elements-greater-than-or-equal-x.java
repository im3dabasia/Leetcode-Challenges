class Solution {
    public int specialArray(int[] nums) {
        int cnt = 0;
        
        for (int i = 1; i <= nums.length ; i++){
            
            for (int j = 0; j < nums.length; j++){
                
                if(nums[j] >= i){
                    
                    cnt++;
                    
                }
                
            }
            if(cnt == i){
                
                return cnt;
                
            }
            cnt = 0;
        }
        return -1;
    }
}