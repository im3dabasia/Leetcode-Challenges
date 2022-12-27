class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        
        Stack myStack = new Stack();
        
        for (int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '('){
                
                myStack.push("(");
                
                if(myStack.size() > 1){
                    
                    ans.append('(');
                }
            }
            
            else{

                if( myStack.peek().equals("(")  && myStack.size() > 1 ){
                    
                    ans.append(')');
                }
                
                myStack.pop();
                
                }
                
            }
        return ans.toString();
    }
}