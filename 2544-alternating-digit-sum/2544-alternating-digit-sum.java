class Solution {
    public int alternateDigitSum(int n) {
        String temp = "" + n;
        
        int ans = 0;
        for(int i = 0 ; i < temp.length(); i++ ){
            
            if(i % 2 ==0){
                ans = ans + Integer.parseInt(""+temp.charAt(i));
            }else{
                ans = ans - Integer.parseInt(""+temp.charAt(i));
            }
        }
        
        return ans;
    }
}