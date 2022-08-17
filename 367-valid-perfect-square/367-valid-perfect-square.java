class Solution {
    public boolean isPerfectSquare(int num) {
        
//         int ans = (int) Math.pow(num,0.5);
        
//         if ( ans * ans == num){
//             return true;
//         }
//         return false;
        
        long start = 0;
        long end = num;
        long mid = start + ((end - start)/2);
        
        while(start <= end){
            
            mid = start + ((end - start)/2);
            
            if((mid * mid) == num){
                
                return true;
            
            }
            else if((mid * mid) < num){
                
                start = mid + 1;
            
            }else if((mid * mid) > num){
                
                end = mid - 1  ;
            
            }
            
        }
        return false;
        
    }
}