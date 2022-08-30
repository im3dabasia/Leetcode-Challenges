class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        
        while(right < prices.length){
            
            int tempProfit = prices[right] - prices[left];
            
            if(prices[left] < prices[right]){
                
                maxProfit = Math.max(tempProfit,maxProfit);
            }
            else{
                left = right;
            }
            right +=1;
            }
        
        return maxProfit;
    }
}


        // left = 0   
        // right = 1  
        // maxp = 0
        // while right < len(prices):
        //     cp = prices[right] - prices[left]  
        //     if prices[left] < prices[right]:
        //         maxp =max(cp,maxp)
        //     else:
        //         left = right
        //     right += 1
        // return maxp