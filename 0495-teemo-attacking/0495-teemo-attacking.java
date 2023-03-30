class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int cnt = 0;
        
        if(timeSeries.length == 1) return duration;
        if(timeSeries.length >1) cnt += duration;
        
        for(int i = timeSeries.length - 1; i >0 ; i--){
            
            if(timeSeries[i] - timeSeries[i - 1] <= duration){
                cnt+= timeSeries[i] - timeSeries[i - 1];
                
            }
            else{
                cnt += duration;
            }
            
        }
        return cnt;
    }
}