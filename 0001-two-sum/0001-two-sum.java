class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        Map<Integer, Integer> myMap = new HashMap<>();
        
        for  (int i = 0; i < nums.length; i++){
            
            if(myMap.containsKey(target - nums[i])){
                return new int[] {i , myMap.get(target- nums[i])};
            }
            else{
                myMap.put(nums[i], i);
            }
        }
        
        return new int[]{0 , 0};
        
    }
}