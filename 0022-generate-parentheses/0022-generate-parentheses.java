class Solution {
    
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        
        helper(n, 0,0,"");
        return res;
    }
    
    private void helper(int n, int left, int right, String str){
        System.out.println(left + " " + right);
        
        // if(right < left) return;
        if(left > n || right > n){
            return;
        }
            System.out.println(str + " String" + str.length());
        
        if(str.length() == (n*2)){
            System.out.println("Added" );
            
            res.add(str);
            return;
        }

        
           helper(n, left + 1, right, str + "(");
           if(left >right) helper(n, left , right +1, str + ")");
        
        
    }
}