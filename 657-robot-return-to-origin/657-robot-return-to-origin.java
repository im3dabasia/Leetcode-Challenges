class Solution {
    public boolean judgeCircle(String moves) {
        
        int cntX=0,cntY=0;
        
        for (int i = 0; i < moves.length(); i++){
            
            if(moves.charAt(i) == 'U'){
                cntY++;
            }
            if(moves.charAt(i) == 'D'){
                cntY--;
            }
            if(moves.charAt(i) == 'R'){
                cntX++;
            }
            if(moves.charAt(i) == 'L'){
                cntX--;
            }
        }
        
        if(cntX ==0 && cntY ==0){
            
            return true;
        }
        return false;
        
    }
}