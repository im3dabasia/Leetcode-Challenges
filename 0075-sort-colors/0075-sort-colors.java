class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while(mid <= high){
            
            if(nums[mid] == 0){
                swap(nums,low, mid);
                mid++;
                low++;
            }else if( nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
        
        
    }
    
    private void swap(int[] nums, int low, int high){
        
        int temp = nums[low];
        nums[low] = nums[high];
        
        nums[high] = temp;
    }
}


// if you see zeros you swap them forward
// if you see 2s you swap them at the back 
//maintain 2 pointers