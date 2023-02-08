class Solution {
    public long minimalKSum(int[] nums, int k) {
        long sum = ((long)k*((long)k+1))/2;
        Arrays.sort(nums);
        Set<Long> mySet = new TreeSet<>();
        
        for(int i =0; i < nums.length;i++){
            mySet.add((long)nums[i]);
        }
        
        for(long ele : mySet){
            if(ele <= k){
                sum -= ele;
                k++;
                sum += k;
            }
        }
        return sum;
    }
}


