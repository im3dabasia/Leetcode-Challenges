class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for(String item: operations){
            if(item.equals("X++")  || item.equals("++X")  ){
                val++;
                
            }
            else{
                val--;
            }
        }
        return val;
    }
}