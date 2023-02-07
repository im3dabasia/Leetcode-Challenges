class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i =0; i < nums.length;i++){
            myMap.put(nums[i], i);
        }
        for(int i = 0; i < operations.length; i++){
            nums[myMap.get(operations[i][0])] = operations[i][1];
            myMap.put( operations[i][1], myMap.get(operations[i][0]));
            myMap.remove(operations[i][0]);
        }
        return nums;
    }
}