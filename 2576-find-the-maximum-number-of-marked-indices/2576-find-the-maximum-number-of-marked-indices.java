class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length, j = n -1;
        int cnt = 0;
        
        for (int i = n/2-1; i >= 0; --i) {
            if (nums[i] * 2 <= nums[j]) {
                System.out.println(nums[i] + " " + nums[j]);
                
                cnt += 2; 
                j -= 1;
            }
        }
        return cnt; 
    }
}