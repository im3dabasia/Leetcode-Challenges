class Solution {
    public int trap(int[] height) {

        if (height.length <= 2) return 0; 
        
        int left = 0, right = height.length-1; 
        int leftMax=0, rightMax=0; 
        int water = 0; 
        
        while (left < right) {
            if (height[left] > leftMax) leftMax = height[left]; 
            if (height[right] > rightMax) rightMax = height[right];
            
            // System.out.println(left + " " + right);
            // System.out.println(leftMax + " " + rightMax);
            // System.out.println( "..");
            
            
            if (leftMax < rightMax) {
                water += Math.max(0, leftMax-height[left]); 
                left++; 
            } else {
                water += Math.max(0, rightMax-height[right]); 
                right--; 
            }
        }
        return water; 
    }
}