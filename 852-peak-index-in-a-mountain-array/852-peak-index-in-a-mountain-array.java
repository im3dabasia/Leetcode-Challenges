class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        //Solution 1 can be a linear scan with 0(n)
        
        int i = 0;
        
        while(arr[i] < arr[i + 1]){
            i++;
        }
        return i;
        
        
    }
}