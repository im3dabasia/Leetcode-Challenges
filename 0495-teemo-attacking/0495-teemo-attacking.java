class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int cnt = 0;
        
        if(timeSeries.length == 1) return duration;
        for(int i = timeSeries.length - 1; i >0 ; i--){
            
            if(i == timeSeries.length - 1){
                cnt += duration;
            }
            
            if(timeSeries[i] - timeSeries[i - 1] <= duration){
                cnt+= timeSeries[i] - timeSeries[i - 1];
                
            }
            
            if(timeSeries[i] - timeSeries[i - 1] > duration){
                cnt += duration;
            }
            
            // cnt+=   
        }
        return cnt;
    }
}