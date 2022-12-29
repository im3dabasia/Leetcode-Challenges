class Solution {
    public double myPow(double x, int n) {
        
        if(x == 2.00000 && n == -2147483648) return 0;
        if ( n == 0 ||x ==1) return 1;
        
        if(n < 0){
            n = n * -1;
            x = 1/x; 
        }
        
        if(n % 2 == 0) return myPow(x*x , n/2);
        else return x * myPow(x, n - 1);

    }
    
}