class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        
        while(low <= high){
            
            int mid = (low + high) /2;
            // System.out.println(mid);
            if( nums[mid] == target){
                
                return mid;
            }
            else if(target < nums[mid]){
                // System.out.println("uu");

                high = mid  -1;
                
                // low++;
            }else{
                // System.out.println("cc");
                low = mid  +1;
                
            }
        }
        return -1;
    }
}