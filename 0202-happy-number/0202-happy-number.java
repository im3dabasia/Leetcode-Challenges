class Solution {
    public boolean isHappy(int n) {
        return helper(n);
        
    }
    private boolean helper(int num){
        
        int res = Integer.MAX_VALUE;
        
        while(res > 9 || res == 7){
            res = helper2(num);
            System.out.println(res);
            num = res;
        }
        
        if(res ==1) return true;
        return false;
    }
    
    
    
    private int helper2(int num){
        
        int ans = 0;
        while(num > 0){
            int temp = num %10;
            ans = ans + (int) Math.pow(temp, 2) ;
            num = num/10;
        }
        return ans;
    }
}