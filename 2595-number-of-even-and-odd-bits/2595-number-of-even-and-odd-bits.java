class Solution {
    public int[] evenOddBit(int n) {
        String bString = Integer.toBinaryString(n);
        StringBuilder temp = new StringBuilder(bString);
        
        temp = temp.reverse();
        
        int[] res = new int[2];
        Arrays.fill(res, 0);
        
        for(int i = 0; i < temp.length(); i++){
            
            if(i % 2 == 0 && temp.charAt(i) == '1'){
                res[0] = res[0] + 1;
                
            }else if(i % 2 == 1 && temp.charAt(i) == '1'){
                res[1] = res[1] + 1;
            }
        }
        
        return res;

    }
}