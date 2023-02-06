class Solution {
    public int countDistinctIntegers(int[] nums) {
        // System.out.println(nums.length);
        
        HashMap<Integer, Boolean> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            myMap.put(nums[i], true);
        }
        
        // System.out.println(myMap.size());
        int cnt = 0;
        
        for(int i = 0 ; i < nums.length; i++){
            
            int temp = nums[i];
            
            int res = 0;
            while(temp != 0){
                
                int mod = temp % 10;
                res = res * 10 + mod;
                
                temp = temp /10;
            }
            
            if(!myMap.containsKey(res)){
                myMap.put(res, true);
                // cnt++;
            }
            
            
            
        }
        
        return myMap.size() ;
    }
}