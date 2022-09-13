class Solution {
    public int dominantIndex(int[] nums) {
        
        int[] tempNums = new int[nums.length]; 
        
        System.arraycopy(nums,0,tempNums,0,nums.length);
        Arrays.sort(tempNums);
        
        
        int maxNUm = tempNums[ nums.length -1];
        for(int i = 0; i <= tempNums.length - 2; i++){
            
            if(tempNums[i] * 2 > maxNUm){
                
                return -1;
            }
            
        }
        
        for(int tk = 0 ; tk < nums.length ; tk++){
            
            if(nums[tk] == maxNUm){
                return tk;
            }
        }
        
        return -1;
    }
}