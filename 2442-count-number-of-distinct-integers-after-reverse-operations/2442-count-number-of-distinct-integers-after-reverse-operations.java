class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i =0; i < nums.length; i++){
            map.put(nums[i], 1);
            
            int tempNum = 0;
            int num2rev = nums[i];
            // System.ou//t.println(nums[i]);
            int k =0;
            
            while(num2rev > 0){
                // if(k > 0) tempNum = tempNum*10;
                tempNum = (tempNum*10) +(num2rev%10);
                num2rev = num2rev/10;
                k++;
                
                // System.out.println(tempNum + " " + num2rev);
                
            }
            // System.out.println(nums[i] + " " + tempNum);
            map.put(tempNum, 1);
        }
        return map.size();
    }
}