class Solution {
    public boolean makeStringsEqual(String s, String t) {
    
        if(s.equals(t))return true;
        int oneS = 0,  zeroS = 0, oneT = 0, zeroT =0;
        
        for(int i = 0 ; i < s.length(); i++){
            
            if(s.charAt(i) == '0')zeroS++;
            
        
            if(t.charAt(i) == '0')zeroT++;
        
        }
        
        if(s.length() == zeroS || t.length() == zeroT) return false;
        else return true;
    }
}