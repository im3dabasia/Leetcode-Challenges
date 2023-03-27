class Solution {
    public int findKthLargest(int[] nums, int k) {
        TreeMap<Integer,Integer> map = new TreeMap(Collections.reverseOrder());
        
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        
        int tempAns = 0;
        for(int i: map.keySet()){
            
            tempAns = tempAns + map.get(i);
            
            if(tempAns >= k) return i;
        }
        
        return 0;

    }
}