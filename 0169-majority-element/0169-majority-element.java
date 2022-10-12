class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int mid = nums.length/2;
        for (int i =0 ; i < nums.length - mid; i++ ){
            
            if(nums[i] == nums[mid]){
                return nums[i];
            }
            
        }
        return 0;
        
//         for(int i = 0; i < nums.length; i++){
            
//             int num = nums[i];
//             int cnt = 0;
            
//             for(int j = 0; j < nums.length; j++){
                
//                 if (num == nums[j]){
                    
//                     cnt++;
                    
//                 }
                
            
//             }
//             if(cnt > nums.length/2){
//                 return num;
//             }
//         }
//         return 0;
        
    }
}