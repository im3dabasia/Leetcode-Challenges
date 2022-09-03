class Solution {
    public int distributeCandies(int[] candyType) {
        
        
//         days she can eat candy
        int len = candyType.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < candyType.length; i++){

            set.add(candyType[i]);

        }
        return Math.min(len, set.size());
        
        
    }
}