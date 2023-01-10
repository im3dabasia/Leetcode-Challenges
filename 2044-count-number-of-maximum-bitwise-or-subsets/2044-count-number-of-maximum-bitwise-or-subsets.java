class Solution {
    List<List<Integer>> res;
    HashMap<Integer, Integer> myMap ;
    public int countMaxOrSubsets(int[] nums) {
        
        res = new ArrayList<>();
//      To store map of value: count
        myMap = new HashMap<>();
        
        backTracker(nums, new ArrayList<>(), 0);
        
        int maxValueInMap = (Collections.max(myMap.values()));
  
        return maxValueInMap;
        
    }
    
    private void backTracker(int[] nums, ArrayList<Integer> temp, int index){
        if(index == nums.length){
            
            int ans = orFunc(temp);
            if(myMap.containsKey(ans)){
                myMap.replace(ans, myMap.get(ans) + 1);
            }
            else{
               myMap.put(ans, 1); 
            }
            return;
        }
            
            temp.add(nums[index]);
            backTracker(nums, temp, index + 1);
            temp.remove(temp.size() - 1);
            backTracker(nums, temp, index + 1);
    }
    
    private int orFunc(ArrayList<Integer> temp){
        
        int ans = 0;
        
        for(int i = 0; i < temp.size(); i++){
            ans = ans | temp.get(i);
        }
        return ans;
    }
}