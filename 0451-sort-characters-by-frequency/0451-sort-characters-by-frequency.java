class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            
            char alphaNum = s.charAt(i);
            
            if(! map.containsKey(alphaNum)){
                
                map.put(alphaNum, 1);
                
            }else{
                
                map.put(alphaNum, map.get(alphaNum) + 1);
                
            }
        }
        
        
        StringBuilder res = new StringBuilder();
        
        List<Character> list = new ArrayList<>(map.keySet());
        
        Collections.sort(list, (a,b) -> (map.get(b) - map.get(a)));
        
        for(Character item: list){
            
            for(int i = 0 ; i < map.get(item); i++){
                res.append(item);
            }
        }
        
        return res.toString();
    }
}

//         Map<Character, Integer> map = new HashMap<>();
//         for(char c: s.toCharArray()){
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
        
//         List<Character> list = new ArrayList<>(map.keySet());
//         Collections.sort(list, (a, b) -> (map.get(b) - map.get(a)));
        
//         StringBuilder sb = new StringBuilder();
//         for(Character c: list){
//             for(int i=0; i<map.get(c); i++){
//                 sb.append(c);
//             }
//         }       
//         return sb.toString();