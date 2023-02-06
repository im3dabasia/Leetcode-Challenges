class Solution {
    public boolean isSameAfterReversals(int num) {
        int pre = num;
        int res = 0;
        
        while(num != 0){
            
            int temp = num %10;
            
            res = res *10 + temp;
            
            num=num/10;
        }
        
        // System.out.println(res);
        int rev = 0;
        while(res != 0){
            
            int temp = res %10;
            
            rev = rev *10 + temp;
            
            res=res/10;
        }
        // System.out.println(rev);
        
        return rev == pre;
    }
}