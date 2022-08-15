class Solution {
    public boolean isPerfectSquare(int num) {
        
        int ans = (int) Math.pow(num,0.5);
        
        if ( ans * ans == num){
            return true;
        }
        return false;
        
    }
}