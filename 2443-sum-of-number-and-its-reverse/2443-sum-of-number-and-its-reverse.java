class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num ==0)return true;
        
        for(int i =0;i < num;i++){
            // System.out.println(i);
            if(i + reverseInteger(i) == num)return true;
        }
        return false;
        
    }
    
    private int reverseInteger(int num){
        
        int temp = 0;
        
        while(num > 0){
            temp = temp*10 + (num%10);
            num = num/10;
            
        }
        return temp;
    }
}