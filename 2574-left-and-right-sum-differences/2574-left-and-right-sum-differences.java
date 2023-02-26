class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        left[0] = 0;
        int lSum = 0;
        int rSum = 0;
        
        
        for(int i =1;i< nums.length;i++){
            lSum = lSum + nums[i - 1];
            left[i] = lSum;
            
        }
        // System.out.println(Arrays.toString(left));
        
        right[nums.length - 1] = 0;
        for(int i =nums.length -2;i>=0;i--){
            rSum = rSum + nums[i +1];
            right[i] = rSum;
        }
        // System.out.println(Arrays.toString(right));
        
        
        for(int i =0;i<nums.length;i++){
            nums[i] = Math.abs(left[i] - right[i]);
        }
        
        return nums;
    }
}