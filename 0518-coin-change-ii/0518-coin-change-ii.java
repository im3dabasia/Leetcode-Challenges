class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length][amount + 1];
        
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(amount, coins, coins.length -1, dp);
    }
    private int helper(int amount, int[] coins, int index, int[][] dp){
        
        if(amount < 0) return 0;
        if(amount == 0) {
            return 1;
        }
        
        
        if(index == 0){
            if(amount % coins[0] == 0) return 1;
            else return 0;
        }
        
        
        if(dp[index][amount] != -1) return dp[index][amount];
        int notPick = 0 + helper(amount, coins, index -1, dp);
        int pick = 0;
        
        if(amount >= coins[index]){
            
            pick = helper(amount - coins[index], coins, index, dp);
        }
        
        return dp[index][amount ] = pick + notPick;
    }
}