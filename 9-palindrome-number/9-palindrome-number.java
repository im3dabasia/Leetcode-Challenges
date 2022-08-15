class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        else{
            String s= Integer.toString(x);
            int len = s.length();
            int newLen = len - 1;
            for (int i = 0; i < len/2; i++){
                if(s.charAt(i) != s.charAt(newLen--)){
                    return false;
                }
            }

        }
            return true;
        
    }
}