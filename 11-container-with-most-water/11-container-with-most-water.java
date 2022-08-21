class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        int minH = 0;
        
        
        while(i < j){
            
            
            if (height[i] < height[j]){
                
                minH = height[i];
                
            }else{
                
                minH = height[j];
            
            }
            
            int area = minH * (j - i);
            
            if(maxArea < area){
                
                maxArea  = area;
            }
            
            
            // to incr and decr i  or j
            if (height[i] < height[j]){
                
                i++;
                
            }else{
                
                j--;
            
            }
        }
        return maxArea;
        
        
        
//         int maxArea = 0;
        
//         for (int i = 0; i < height.length - 1 ; i++){
            
//             for (int j = i + 1; j < height.length; j++){
                
//                 int minVal = height[j];
                
//                 if(height[i] < height[j]){
//                     minVal = height[i];
//                 }
                
//                 if (maxArea < (minVal * (j - i))){
                    
//                     maxArea = minVal * (j - i);
//                 }

//             }
//         }
//         return maxArea;
    }
}