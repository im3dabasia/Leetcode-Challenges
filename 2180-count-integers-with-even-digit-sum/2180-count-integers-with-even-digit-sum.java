class Solution {
    public int countEven(int num) {
        
        
        int cnt =0;
        for(int i =1 ; i <= num; i ++){
            
            
            if(helper(i) % 2 == 0){
                // System.out.println(helper(i));
                cnt++;
            }
            
        }
        
        return cnt;
        
    }
    
    private int helper(int num){
        int ans = 0;
        
        while(num > 0){
            int tempAns = num %10;
            
            
             ans = ans + tempAns;
            num = num /10;
            
        }
        
        return ans;
    }
}