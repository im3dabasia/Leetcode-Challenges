class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long ans = -1;
        long mid = start + ((end - start)/2);
        
        
        while(start <= end){

            mid = start + ((end - start)/2);
            
            
            if(x > (mid * mid)){

                ans = mid;
                start = mid + 1;
                
            }
            else if(x < (mid * mid)){
                
                end = mid - 1;
                
            }
            else {
                
                return (int) mid;
            }
        }
        
        return (int) ans;
        
    }
}