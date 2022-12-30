class Solution {
    public int[] searchRange(int[] arr, int target) {
     
        int index = BS(arr, target);
        
        int[] pair = new int[2];
        pair[0] = -1;
        pair[1] = -1;
        
        
        if(index == -1){
            return pair;
        }
        
        int lowIndex = index;
        int highIndex = index;
        
        while(  lowIndex >= 1 && arr[lowIndex] == arr[lowIndex - 1] ){
            lowIndex--;

        }
                
        while( highIndex < arr.length - 1 && arr[highIndex] == arr[highIndex + 1] ){
            highIndex++;

        }
        pair[0] = lowIndex;
        pair[1] = highIndex;
        
        return pair;
            
    }
    private int BS(int[] arr , int target){
        
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high){
            
            int mid = low + (high -low)/2;
            
            if(target == arr[mid]){
                System.out.println("hell");
                return mid;
            }
            else if(target > arr[mid]){
                
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
        
    }
}