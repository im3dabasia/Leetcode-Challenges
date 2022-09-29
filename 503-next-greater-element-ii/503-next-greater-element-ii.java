class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] ansArr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
        //Base case intilialise all numbers to -1 initially
        
            ansArr[i] = -1;
            
            for(int j = 1; j < nums.length; j++){
                
               if (nums[(i + j) % nums.length] > nums[i]) {
                    ansArr[i] = nums[(i + j) % nums.length];
                    break;
                }
                
            }
        }
        return ansArr;
    }
}