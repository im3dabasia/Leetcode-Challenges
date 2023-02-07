class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        
        for(int item: nums){
            mySet.add(item);
        }
        
        for(int i =1; i <= nums.length; i++){
            if(!mySet.contains(i)){
                res.add(i);
            }
        }
        // System.out.println(mySet.size());
        return res;
    }
}