class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        
        for(int i = 0; i< nums.length; i++){
            
            // System.out.println(i);
            while(!q.isEmpty() &&  nums[q.getLast()] <= nums[i]){
                q.removeLast();
                
            }
            q.addLast(i);
            
            if(q.getFirst() == i - k){
                q.removeFirst();
            }
            if(i >= k - 1){
                ans.add(q.peek());
            }
        }
        
        int[] res = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            res[i] = nums[ans.get(i)];
            
        }
        return res;
    }
}

