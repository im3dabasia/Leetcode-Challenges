class Solution {
    List<List<Integer>> output = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        helper(0, nums, new ArrayList<>());
        
        return output;
        
    }
    private void helper(int index, int[] nums, ArrayList<Integer> temp){
        
        if(index == nums.length ){
            if(!output.contains(temp)){
                output.add(new ArrayList<>(temp));
            }
            return;
        }
        
        temp.add(nums[index]);
        helper(index + 1, nums, temp);
        temp.remove(temp.size() - 1);
        helper(index + 1, nums , temp);
    }
}