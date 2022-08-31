class Solution {
    public void sortColors(int[] nums) {
        
//         for (int i = 0; i < nums.length - 1; i++){
            
//             for(int j = i + 1; j < nums.length; j++){
                
//                 if(nums[j] < nums[i]){
                    
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
        
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int index = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if (nums[i] == 0){
                cnt0++;
            }
            else if(nums[i] == 1){
                
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        
        for (int i = 0; i < cnt0; i++){
            
            nums[index++] = 0;
            
        }
        for (int i = 0; i < cnt1; i++){
            
            nums[index++] = 1;
            
        }
        for (int i = 0; i < cnt2; i++){
            
            nums[index++] = 2;
            
        }
    }
}