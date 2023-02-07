class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // HashSet<Integer> mySet = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        
        // for(int item: nums){
        //     mySet.add(item);
        // }
        Arrays.sort(nums);
        
        for(int i =0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                res.add(nums[i]);
            }
            
        }
        return res;
        
    }
}