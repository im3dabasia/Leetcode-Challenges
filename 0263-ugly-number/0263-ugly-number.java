class Solution {
    public boolean isUgly(int n) {

        if(n == 0) return false;
        if(n ==1) return true;
        if(n < 0 ) return false;
        int[] newArr = {2,3,5};

        for (int item: newArr){

            while(n % item == 0){
                 n = n / item;

            }

        }
        
        return n == 1;
        
    }
}