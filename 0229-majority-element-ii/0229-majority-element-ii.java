class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            
            if(!map.containsKey(nums[i])){
                
                map.put(nums[i], 0);
                
            }
            else{

                map.put(nums[i], map.get(nums[i]) + 1);
                
            }
            
        }
        
        int cutOff = nums.length / 3;
        
        for(int p = 0; p < nums.length; p++){
            
            if(map.get(nums[p]) >= cutOff && !res.contains(nums[p])){

                res.add(nums[p]);
            }
        }
        
        return res;

    }
}