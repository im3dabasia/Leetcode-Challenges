class Solution {
    public List<List<Integer>> groupThePeople(int[] nums) {
        HashMap<Integer, List<Integer>> myMap = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(myMap.containsKey(nums[i])){
                List<Integer> temp = new ArrayList<>(myMap.get(nums[i]));
                temp.add(i);
                myMap.put(nums[i], new ArrayList<>(temp));
            }
            else{
                List<Integer> temp2 = new ArrayList<>();
                temp2.add(i);
                myMap.put(nums[i], new ArrayList<>(temp2));
            }
        }
        List<Integer> keySets = new ArrayList<>(myMap.keySet());
        List<List<Integer>> res = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < myMap.size(); i++){
            int len = keySets.get(idx);
            int index = 0;
            int lengthOfValue = myMap.get(keySets.get(idx)).size();

            while(index != lengthOfValue){
                res.add(new ArrayList<>(myMap.get(keySets.get(idx))).subList(index, index + len));
                index = index+len;
            }
            idx++;
        }
        return res;
    }
}