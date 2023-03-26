class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) return null;
        Map<String, List<String>> hashMap = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String key = String.valueOf(chArr);
            List<String> val = hashMap.get(key);
            if (val == null) {
                val = new ArrayList<>();
            }
            val.add(strs[i]);
            hashMap.put(key, val);
        }  
        return new ArrayList<>(hashMap.values());
    }
}

