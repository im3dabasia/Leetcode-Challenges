class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length()) return false;
        int len = s.length();
        List<Integer> temp = new ArrayList<>();
            
        for(int i = 0 ; i < s.length(); i++){
            if(goal.charAt(0) == s.charAt(i)){
                temp.add(i);
            }
        }
        // System.out.println(temp);
        if(temp.size() > 0 ){
            int i = 0;
            
            while(true){
            
                int startIndex = temp.get(i++);
                // System.out.println(startIndex);
                int j = 0;
                while(true){
                // System.out.println(s.charAt(((startIndex + j)) % goal.length() ) + " " +  goal.charAt(j));
                    
                    if(s.charAt(((startIndex + j)) % goal.length() ) != goal.charAt(j) ){
                        break;
                    }
                    j++;
                    
                    if(j == s.length()) return true;
                }
                // i++;
                // System.out.println("oop");
                
                if(i == temp.size()) break;
            }
        }
        return false;

    }
}