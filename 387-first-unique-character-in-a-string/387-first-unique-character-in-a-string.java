import java.io.*;
import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> Maps = new HashMap<Character,Integer>();
        
        char[] tempChars = s.toCharArray();
        
        for( char c: tempChars){
            
            if (Maps.containsKey(c)){
                
                Maps.put(c, Maps.get(c) + 1);
            }else{
                
                Maps.put(c, 1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            
            if(Maps.get(s.charAt(i)) == 1){
                return i;
            }
        }
        
        return -1;
        
        
        
    }
}