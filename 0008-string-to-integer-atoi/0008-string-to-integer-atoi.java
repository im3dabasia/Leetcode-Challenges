class Solution {
    public int myAtoi(String s) {
        
        // s = s.strip();
        
        int start = -1;
        int end = -1;
        
        for(int i = 0; i < s.length(); i++){
            
            System.out.println(Character.isDigit(s.charAt(i)) );
            if(Character.isLetter(s.charAt(i)) || s.charAt(i) == '.'){

                break;
            }
            
            if(s.charAt(i) == ' ') continue;
            
            if(Character.isDigit(s.charAt(i)) || s.charAt(i) == '+' || s.charAt(i) == '-'){
                start = i;
                end = i;
                
                i++;
                
                while(i < s.length() && Character.isDigit(s.charAt(i)) ){
                    end = i;
                    i++;
                }
                break;
            } 
        }
        // System.out.println(start+ " "+ end);
        if(start == end && (end == -1 || s.charAt(end) == '-' || s.charAt(end) == '+')) return 0;
        
        int ans = 0;
        
        try{
            
            ans = Integer.parseInt(s.substring(start,end + 1));
            
        }catch(NumberFormatException e){
            
            if(s.charAt(start) == '-'){
                return Integer.MIN_VALUE;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        return ans;
        
    }
}