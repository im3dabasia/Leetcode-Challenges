class Solution {
    public int thirdMax(int[] nums) {
        
        SortedSet<Integer> mySet = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++){
            
            mySet.add(nums[i]);
            
        }

        if(mySet.size() >= 3){
            mySet.remove(mySet.last());
            mySet.remove(mySet.last());
            
            return mySet.last();
            
        }

        return mySet.last();
    }
}