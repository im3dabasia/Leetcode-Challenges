class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        
//         pointers
        int idx = 0;
        int idx2 = 0;
        
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > 0){
                pos[idx++] = nums[i];
            }else{
                neg[idx2++] = nums[i];
            }

        }
        
        idx = 0;
        idx2 = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            nums[i] = pos[idx++];
            nums[i+ 1] = neg[idx2++];
            
        }
        return nums;
    }
}