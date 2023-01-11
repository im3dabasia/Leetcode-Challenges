class Solution {
    List<List<Integer>> output;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        output = new ArrayList<>();
        
        Arrays.sort(candidates);
        helper(candidates, new ArrayList<>(), target,  0);
        
        return output;
    }
    
    private void helper(int[] candidates, List<Integer> temp, int target, int index){
        

        if(target < 0) {
            return;
        }
        else if(target == 0 ){
            // Collections.sort(temp);
            
            // if(!output.contains(temp)){
                output.add(new ArrayList<>(temp));
            // }
            return;
        }
        else{
            
            for(int i = index; i < candidates.length; i++){
                temp.add(candidates[i]);
                helper(candidates, temp, target - candidates[i], i );
                temp.remove(temp.size() - 1);
            }   
        }
    }

}