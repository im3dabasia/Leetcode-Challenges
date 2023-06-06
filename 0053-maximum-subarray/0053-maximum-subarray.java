class Solution {
    public int maxSubArray(int[] nums) {
        
        //kadane
        
        int sum = 0;
        int mx = -10000;
        
        for(int i = 0; i < nums.length; i++){


            sum += nums[i];

            mx = Math.max(mx,sum);
            // System.out.println(i + " " + mx);
            
            if(mx < 0){
                sum = 0;
            }
            if(sum < 0){
                sum = 0;
            }
            // System.out.println(i + " Mx: " + mx + " sum: " + sum);
        }
        return mx;
    }
}