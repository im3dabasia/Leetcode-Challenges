class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int uniqueElement = nums[0];
        
        for (int i = 0; i < nums.length - 1 ; i++){
            
            uniqueElement ^= nums[i + 1];
        }
        
        return uniqueElement;
    }
}