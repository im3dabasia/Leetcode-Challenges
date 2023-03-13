//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        
        int[] dp = new int[n];
        Arrays.fill(dp, 0);
        
        if(arr.length == 1) return arr[0];
        
        helper(arr, n -1, dp );
        // System.out.println(Arrays.toString(dp));
        return dp[n - 1];
        
        
        
    }
    
    private int helper(int arr[], int index, int[] dp ){
        if(index == 0) return arr[0];
        
        if(index <= -1)return 0;
        
        if(dp[index] != 0) return dp[index];
        
        int pick = arr[index] + helper(arr, index - 2, dp);
        int notpick = 0 + helper(arr, index - 1, dp);
        
        return dp[index] = Math.max(pick, notpick);
    }
}