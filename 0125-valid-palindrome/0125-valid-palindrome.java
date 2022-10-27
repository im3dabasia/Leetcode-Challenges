class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        
        return checker(0, s.length() - 1, s);
                
    }
    
    public static boolean checker(int a, int b, String s){
        
        if(a >= b ) return true;
        
        if(s.charAt(a) != s.charAt(b)) return false;
        
        
        return checker(a + 1, b - 1, s);
        
    }
}


    