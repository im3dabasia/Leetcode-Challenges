class Solution {
    public void sortColors(int[] nums) {
        
        //Approach 3 Dutch National FLag ALgorithm 0(N)
        
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        
        
        while(mid <= high){
            
            if(nums[mid] == 0){
                
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                
                mid++;
                low++;
                
            }else if(nums[mid] == 1){
                
                mid++;
                
            }else{
                
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                
                high--;
            }
        }
            
        
        // Approach1  sorting 0(logN)
        // Arrays.sort(nums)
        
        //Approach 2 0(2N)
        
//         int cnt_0 = 0;
//         int cnt_1 = 0;
//         int cnt_2 = 0;
//         for (int i = 0; i < nums.length; i++){
        
//             if(nums[i] == 0)
//                 cnt_0++;
            
//             else if(nums[i] == 1)
//                 cnt_1++;
//             else
//                 cnt_2++;
            
//         }
        
//         for(int i = 0; i < nums.length; i++){
            
            
//             if(i < cnt_0){
//                 nums[i] = 0;
//             }
//             else if( i < (cnt_0 + cnt_1)){
//                 nums[i] = 1;
//             }
//             else{
//                 nums[i] = 2;
//             }
//         }
        
        

    }
}