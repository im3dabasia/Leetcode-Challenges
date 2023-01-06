class Solution {
    public boolean detectCapitalUse(String word) {
        
        int cnt = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) cnt++;
        }
        
        if(cnt == word.length()) return true;
        
        for(int i = 1; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
}