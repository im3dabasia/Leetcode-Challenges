class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        
        int ptr = 0;
        int cnt = 0;
        
        while(true){
            
            if(ptr == costs.length) return cnt;
            
            if(costs[ptr] <= coins){
                cnt++;
                coins = coins - costs[ptr];
                // System.out.println(coins);
                ptr++;
            }else{
                break;
            }
            
        }
        return cnt;
    }
}