class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = 0;
        int ind2 = 0;
        
        int len  = nums.length - 2;
        
        while(len >= 0){
            if(nums[len] < nums[len + 1]){
                
                ind1 = len;
                
                len = nums.length -2;
                break;
            }
            len--;
        }
        
        
        if(len == -1) {
            int h = nums.length -1;
            int l = 0;
            
            while(l < h){
                int tmp = nums[l];
                nums[l] = nums[h];
                nums[h] = tmp;
                l++;
                h--;
            }
            return;

        }
        
        int tmp = nums.length - 1;
        while(tmp > ind1){
            
            if(nums[tmp] > nums[ind1]){
                swap(nums ,tmp, ind1);
                break;
                
            }
            tmp--;
        }
        
        reverse(nums, ind1 + 1);
        
    }
    
    private void swap(int[] nums, int a, int b){
        
        
        int c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;
        
    }
    
    private void reverse(int[] nums, int a){
        
        int low = a;
        int high = nums.length -1;
        
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}