class Solution {
    public int findDuplicate(int[] nums) {
//         HashMap Approach
        int[] hashMap  = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            hashMap[nums[i]]++;
            
            if(hashMap[nums[i]] == 2){
                
                return nums[i];
            }
            
        }
        
        return 0;
        
        
        
//         Approach 1
//         Arrays.sort(nums);
        
//         for (int i = 0; i < nums.length -1; i++){
            
//             if (nums[i] == nums[i+1]){
                
//                 return nums[i];
//             }
//         }
//         return 0;
        
    }
}