class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int j = nums.length -1;
        while(j >= 0){
            int max = nums[j];
            
            
            for(int i =0; i < nums.length; i++){
                if(nums[i] == (-1 * max)){
                    return max;
                }
            }
            j--;
        }
        
        return -1;
    }
        
}