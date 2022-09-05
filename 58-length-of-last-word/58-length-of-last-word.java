class Solution {
    public int lengthOfLastWord(String s) {
        s  = s.trim();
        String[] temp  = s.split(" ");
        
        int len = temp.length - 1;
        
        return temp[len].length();
        
    }
}