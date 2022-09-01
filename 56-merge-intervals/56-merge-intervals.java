class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (e1, e2)-> e1[0]-e2[0]);

        ArrayList<int[]> ans = new ArrayList<>();
        
        int len = intervals.length;
        int left = 0;
        
        while(left < len){
            
            int right = left+1;
            int rightBoundary = intervals[left][1];
            
            while(right < len && intervals[right][0] <= rightBoundary){
                
                rightBoundary = Math.max(rightBoundary, intervals[right][1]);
                right++;
                
            }
            
            ans.add(new int[]{intervals[left][0], rightBoundary}); 
            left = right;
        }
        
        
       int[][] ansArr = new int[ans.size()][2];
        
        for( int i = 0; i < ansArr.length; i++){
            
            ansArr[i] = ans.get(i);
        }
        
        return ansArr;
        
        
    }
}