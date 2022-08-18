class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        
        int firstIndex = -1;
        int lastIndex = -1;
        
        while(start <= end){
            
            int mid = start + ((end -start)/2);
            if( target <= nums[mid]){
                
                if(target == nums[mid]){
    
                    firstIndex = mid;
                    
                }
                end  = mid - 1;
                
                
            }
            else{
                start = mid + 1;
                
            
            }
        }
        //last index
            start = 0;
            end = nums.length -1;
            while(start <= end){
            
            int mid = start + ((end -start)/2);
            if( target >= nums[mid]){
                
                if(target == nums[mid]){
    
                    lastIndex = mid;
                    
                }
                
                start  = mid + 1;
                
            }
            else{

                end = mid - 1;
            
            }
        }
        
        return new int[] {firstIndex, lastIndex};
        
    }
}