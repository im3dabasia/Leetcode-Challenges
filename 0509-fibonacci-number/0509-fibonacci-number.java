class Solution {
    public int fib(int n) {
//         0 1 1 2 3 5 8 13 21 34 55 
        
        if(n ==1) return 1;
        
        int a = 0;
        int b = 1;
        int c =0 ;
        for(int i = 0; i < n -1; i++){
            
            c = a + b;
            a = b;
            b = c;
            
            
        }
        return c;
    }
}