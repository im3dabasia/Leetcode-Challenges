class Solution {
    public int majorityElement(int[] nums) {
        
        
//         Approach 3 Moores Algorithm
            int cnt = 0;
            int elem = 0;
        
        for (int i = 0 ; i < nums.length; i++){
            
            if(cnt == 0) {
                
              elem = nums[i];
  
            }             
            if(nums[i] == elem){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return elem;
        
        
        
//         Approach 2
//         Arrays.sort(nums);
//         int mid = nums.length/2;
//         for (int i =0 ; i < nums.length - mid; i++ ){
            
//             if(nums[i] == nums[mid]){
//                 return nums[i];
//             }
            
//         }
//         return 0;
        
        
        
//         Approach 1
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