class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        String[] tempList = s.split(" ");
//         for(int i = 0; i < tempList.length; i++){
            
//             tempList[i] = tempList[i].trim();
//         }
        
        
        StringBuilder ansStr = new StringBuilder();
        for( int i = tempList.length - 1; i >= 0 ; i--){
            
            if(tempList[i].length()  > 0){
                
            ansStr.append(tempList[i]);
            
            if(i != 0){
                ansStr.append(" ");
                
            }
                
        }
            

            
        }
        
        return ansStr.toString();
        // return tempList[4];
    }
}