class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            String currString = str;
            char[] charactersInString = currString.toCharArray();
            Arrays.sort(charactersInString);
            
            List<String> val = map.get(String.valueOf(charactersInString));
            
            if(val == null) {
                val = new ArrayList<>();
            }
            val.add(currString);
            map.put(String.valueOf(charactersInString), val);
                

        }
        // System.out.println(map.keySet());
        return new ArrayList<>( map.values() );
    }
}