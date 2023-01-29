class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k == 1 || k == weights.length) return 0;
        
        long ans = 0;
        long ans1 = 0;
        k--;
        ArrayList<Long> res1 = new ArrayList<>();
        
        for(int i =0; i < weights.length - 1;i++){
            res1.add((long) (weights[i] + weights[i + 1]));
        }
        ArrayList<Long> res = new ArrayList<>(res1);
        Collections.sort(res1,Collections.reverseOrder());
        Collections.sort(res);
        for (int i = 0; i < k; i++) ans1 += res1.get(i);
        for (int i = 0; i < k; i++) ans += res.get(i);
        
        return ans1-ans;
        
    }
}