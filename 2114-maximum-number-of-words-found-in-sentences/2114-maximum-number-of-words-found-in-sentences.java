class Solution {
    public int mostWordsFound(String[] sentences) {
        
        
        int max =0;
        
        for (int i = 0; i < sentences.length; i++){
            
            int tempLen = sentences[i].split(" ").length;
            
            if (max < tempLen){
                max = tempLen;
            }
            
            
            
        }
        
        return max;
        
    }
}