class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int dp[][] = new int[coins.length][amount + 1];
        
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        int ans = helper(coins.length - 1, coins, amount, dp);
        
        return  ans >= 100000 ? -1: ans;
    }
    private int helper(int index, int[] coins, int amt, int[][] dp){
        
        if (index == 0){
            if(amt % coins[0] == 0) return amt/coins[0];
            else return 100000;
        }
        
        if(amt < 0 )return 100000;
        
        if(dp[index][amt] != -1) return dp[index][amt];
        
        int notPick = 0 + helper(index -1,  coins, amt, dp);
        
        int pick = 100000;
        
        if(coins[index] <= amt){
            
            pick = 1 + helper(index, coins, amt - coins[index], dp);
        }
        return dp[index][amt] = Math.min(pick , notPick);
    }
}