class Solution {
    public int minimizeSum(int[] nums) {
        
        if(nums.length == 3) return 0;
        int n = nums.length;
        
        Arrays.sort(nums);
        
        return Math.min(
            Math.min(nums[n-1] - nums[0], nums[(n-1)] - nums[(2)]),
            Math.min(nums[(n-3)] - nums[(0)], nums[(n-2)] - nums[(1)])
        );
        
    }
}