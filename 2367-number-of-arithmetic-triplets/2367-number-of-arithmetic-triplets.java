class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        
        int cnt = 0;
        int len = nums.length - 1;
        for(int i = nums.length - 1; i > 0; i--){
            
            int top = nums[i];
            int idx = i - 1;
            int tempCnt = 1;

            while(idx >= 0  ){
                // System.out.println(top + " " + nums[idx]);
                
                if(top - nums[idx] != diff) idx--;
                else{
                // System.out.println("kk");
                    
                    top = nums[idx];
                    tempCnt++;
                    idx--;
                }
                
                // System.out.println(  "tempCnt:" + tempCnt);
                
                if(tempCnt == 3){
                    cnt++;
                    break;
                } 
                // System.out.println(top + " " + nums[idx]);
            } 
            
        }
        return cnt ;
        
    }
}