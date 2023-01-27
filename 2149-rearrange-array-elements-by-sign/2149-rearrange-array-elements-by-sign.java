class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int idx = 0;
        int idx2 =0;
        
//         Making arrays
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];
        
        for(int i = 0 ; i < nums.length; i++){
            if( nums[i]  > 0){
                odd[idx++] = nums[i];
            }else{
                even[idx2++] = nums[i];
            }
        }
        
        
        idx = 0;
        idx2 = 0;
        for(int i = 0 ;i< nums.length; i+=2){
            nums[i] = odd[idx++];
            nums[i + 1] = even[idx2++];
        }
        return nums;
    }
}