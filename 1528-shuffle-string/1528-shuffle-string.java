class Solution {
    public String restoreString(String s, int[] indices) {
	    
        StringBuilder ans  = new StringBuilder(s);
        
        for (int i = 0; i < indices.length; i++){
            
            int index = indices[i];
            ans.setCharAt(index, s.charAt(i) );
            
        }
        
        return ans.toString();
        
    }
}