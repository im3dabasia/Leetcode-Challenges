class Solution {
    public String reverseWords(String s) {
        
        StringBuilder ans = new StringBuilder();
        
        String[] res = s.strip().split(" ");
        

        
        for(int i = res.length - 1; i >= 0; i--){
            
           if(res[i] != ""){
                ans.append(res[i] + " ");
            }
        }
        
        return ans.toString().strip();
        
    }
}