class Solution {
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        if(target < nums[0]) return 0;
        if(target == nums[0]) return 0;

        int mid = 0;
        while(low <= high){
            mid = low + (high -low)/2;
            
            if( target == nums[mid]){
                break;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else if( target < nums[mid]){
                high = mid -1;
            }
    }
        System.out.println(mid);
        
        if(target > nums[mid]) return mid + 1;
        else return mid;    
    }
}

