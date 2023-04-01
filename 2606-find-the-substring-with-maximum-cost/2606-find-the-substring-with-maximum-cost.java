class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        
        for(int i = 0 ; i  < vals.length; i++){
            map.put(chars.charAt(i), vals[i]);
        }
        
        for (int i = 97; i <= 122; i++) {
            if(!map.containsKey((char) i)  ){
              map.put((char) i, i -97 + 1);
            }
        }
        
        int ans =0;
        int sum = 0;
        
        for(int i=0;i<s.length();i++){
            sum += map.get(s.charAt(i));
            if(ans<sum) ans = sum;
            if(sum < 0) sum = 0;
        }
        return ans;
    }
}