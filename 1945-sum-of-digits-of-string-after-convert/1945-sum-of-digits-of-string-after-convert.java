class Solution {
    public int getLucky(String s, int k) {
        HashMap<Character, Integer > map = letters();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i = 0 ; i  < s.length(); i++){
           temp.add(map.get(s.charAt(i)));
        }
        // System.out.println(temp);
        int ans1 = transform1(temp);
        if(k>1){
            int p = 1;
            while(p < k){
                int tempAns = transform2(ans1);
                ans1 = tempAns;
                p++;
                
            }
            return ans1;
        }
        return ans1;
        
    }
    
    private int transform1(List<Integer> temp){
        int sum =0;
        for(int i = 0 ; i < temp.size(); i++){
            sum += transform2(temp.get(i));
            // System.out.println("sum " + sum);
            
        }
        return sum;
    }
        private int transform2(int num){
            
            int ans = 0;
            while(num > 0){
                int tempNum = num %10;
                ans = ans + tempNum;
                num = num /10;
                
            }
            return ans;

    }
    
    private HashMap<Character,Integer> letters(){
        HashMap<Character, Integer > map = new HashMap<>();
        int i =1;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch,i++);
        }
        return map;
    }
}