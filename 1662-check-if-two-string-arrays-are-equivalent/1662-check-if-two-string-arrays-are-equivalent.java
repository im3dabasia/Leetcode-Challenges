class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String temp1 = "";
        String temp2 = "";
        
        for (int i = 0; i < word1.length; i++){
            
            temp1 += word1[i];
            
        }
        
        for (int i = 0; i < word2.length; i++){
            
            temp2 += word2[i];
            
        }
        
        return temp1.equals(temp2);
    }
}