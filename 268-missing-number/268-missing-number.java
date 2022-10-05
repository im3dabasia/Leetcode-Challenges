class Solution {
    public int missingNumber(int[] nums) {
        
//         Approach 2 Xor approach
        
        int Array_XOR = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            Array_XOR = Array_XOR ^ nums[i];
        }
        
        for(int i = 0; i <= nums.length; i++){
            
            Array_XOR = Array_XOR ^ i;
        }
        return Array_XOR;
        
        
        
        
//         Approach 1 0(2N ) space = 0(N)
//         int[] hashMap = new int[nums.length + 1];
        
//         for(int i = 0; i < nums.length; i++){
            
//             hashMap[nums[i]]++;
            
//         }
        
//         for(int i = 1; i < hashMap.length; i++){
            
//             if(hashMap[i] == 0){
//                 return i;
//             }
//         }
        
//         return 0;
    }
}