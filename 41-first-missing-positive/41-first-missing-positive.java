class Solution {
    public int firstMissingPositive(int[] nums) {
        
    Set<Integer> mySet = new HashSet<>();

        for(Integer num : nums){
            mySet.add(num);
        }
        
        int i = 0;
        for( i = 1; i <= nums.length; i++){
        
            if(mySet.contains(i) == false){
                
                return i;
            }
        }

        return i;
    }
}