class Solution {
    public int search(int[] nums, int target) {
        
        
//         int rotationPoint = peakIndexInMountainArray(nums);
        
//         int ans1 = search(nums, target, 0, rotationPoint);
        
//         }
        
//         if (ans1 == -1){
            
//             // return search(nums, target, rotationPoint, nums.length - 1);
//             return rotationPoint;
            
//         }
//         return ans1;
    int start = 0;
    int end = nums.length - 1;
    int mid=start + (end - start)/2;

    while(start <= end){
        
        if(nums[mid] == target)
        
            return mid;
        
        
        else if(nums[start] <= nums[mid]){
            
            if(nums[start] <= target && nums[mid] > target)
            
                end = mid - 1;
            
            else
            
                start = mid + 1;
        }
        
        else if(nums[mid] <= nums[end]){
            
            if(nums[mid] < target && nums[end] >= target){
                
                start = mid + 1;
            
            }
            
            else
            
                end = mid-1;
        
        }
        
        mid = start +(end- start)/2;
    
    }
    
        return -1;
        
    }
    
    
//     public int peakIndexInMountainArray(int[] arr) {
        
//         int start = 0;
//         int end = arr.length -1;
        
//         while(start < end){
            
//             int mid = start + ((end -start)/2);
            
//             if(arr[mid] > arr[mid + 1]){
                
//                 end = mid;
                
//             }
//             else{
                
//                 start = mid + 1;
                
//             }
//         }
//         return end;
        
//     }
    
//     public int search(int[] nums, int target ,int start, int end ) {

//         int mid = (start + end) / 2;
        
//         while (start <= end){
            
//             mid = (start + end) / 2;
            
//             if (nums[mid] == target){
                
//                 return mid;
                
//             }
//             else if( nums[mid ] < target ){
                
//                 start = mid + 1;
                
//             }
//             else{
                
//                 end = mid - 1;
                
//             }
//         }
//         return -1;
//     }
    
}