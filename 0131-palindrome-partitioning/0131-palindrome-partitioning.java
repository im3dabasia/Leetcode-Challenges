class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        function(0, s, temp, result);
         
        return result;
    }
    
    private boolean isPalin(String s, int start, int end){
        
        while(start <= end){
            
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        
        return true;    
    }
    
    private void function(  int index, String s, List<String> temp, List<List<String>> result){
        
        if(s.length() == index){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = index; i < s.length() ; ++i){
            
            if(isPalin(s, index, i )){       
                
                temp.add(s.substring(index, i +1 ));
                function(i + 1, s, temp, result);
                temp.remove(temp.size() -1 );
                
            }
        }   
    }   
    
    
}