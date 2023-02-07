class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        int cnt =0;
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] < pivot){
                left.add(nums[i]);
            }else if(nums[i] > pivot) {
                right.add(nums[i]);
            }else{
                cnt++;
            }
        }
        for(int i =0; i < cnt; i++){
            left.add(pivot);
        }
        left.addAll(right);
        int[] ans = new int[left.size()];
        
        for(int i =0; i < left.size();i++){
            ans[i] = left.get(i);
        }
        return ans;
    }
}