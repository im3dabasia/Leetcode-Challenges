//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int len = arr.length;
	    
	    int dp[][] = new int[len][sum +1];
	    
	    for(int[] item: dp){
	        Arrays.fill(item, -1);
	    }
	    
	    return helper(arr, len - 1, sum, len , dp);
	}
	
	private int helper(int arr[] , int index, int target, int len, int[][] dp){
	    
	   // if(target == 0) return 1;

	   // if(index == 0 && target == arr[0]) return 1;
	   // if(index == 0 && target != arr[0]) return 0;
	    
        if(index == 0){
            if(target == 0 && arr[0]==0)
                return 2;
            if(target==0||target==arr[0])
                return 1;
        return 0;
        }
	    if(dp[index][target] != -1) return dp[index][target];
	    
	    int notPick = helper(arr, index - 1, target, len, dp);
	    int pick = 0;
	    
	    if(arr[index] <= target){
	        pick = helper(arr, index - 1, target - arr[index], len, dp);
	        
	    }
	    
	    return dp[index][target] = (pick + notPick) %(int)(Math.pow(10,9)+7);
	}
}