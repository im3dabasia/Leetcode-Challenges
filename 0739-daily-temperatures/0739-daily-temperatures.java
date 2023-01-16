class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[nums.length];
        
        
        for(int i = nums.length - 1; i >= 0; i-- ){
            
            while(!stk.isEmpty() && nums[i] >= nums[stk.peek()]){
                stk.pop();
            }
            
            if(!stk.isEmpty()){
                res[i] = stk.peek() - i;
            }
            
            stk.push(i);
        }
        return res;
    }
}