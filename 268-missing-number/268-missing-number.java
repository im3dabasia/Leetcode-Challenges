class Solution {
    public int missingNumber(int[] nums) {
        
        int[] hashMap = new int[nums.length + 1];
        
        for(int i = 0; i < nums.length; i++){
            
            hashMap[nums[i]]++;
            
        }
        
        for(int i = 1; i < hashMap.length; i++){
            
            if(hashMap[i] == 0){
                return i;
            }
        }
        
        return 0;
    }
}