class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr = new int[nums1.length + nums2.length];
        
        for(int i = 0; i < nums1.length; i++){
            
            newArr[i] = nums1[i];
        }
        int index2 = 0;
        
        for(int k = nums1.length ; k < newArr.length; k++){
            
            newArr[k] = nums2[index2++];
        }
        
        Arrays.sort(newArr);
        
        if(newArr.length % 2 == 1){
            
            int mid = newArr.length / 2;
            
            return newArr[mid];
        }
        else{
            
            int mid1 = newArr.length / 2;
            int mid2 = newArr.length / 2 - 1;
            
            
            return (double) (newArr[mid1 ] + newArr[mid1 - 1]) / 2;
        }
        
    }
}