//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            Solution obj=new Solution();
            int res=obj.minimizeCost(arr,N,K);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimizeCost(int arr[],int N,int K){
        //code here
         int dp[] = new int[N];
         Arrays.fill(dp, -1);
         return helper(arr, N- 1, K, dp);
    }
    
    private int helper(int[] arr, int index, int k, int[] dp){
        
        if(index == 0) return 0;
        
        if(dp[index] != -1)return dp[index];
        
        int mmSteps = Integer.MAX_VALUE;
        int prob =Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++){
            if(index - i>= 0){
                // System.out.println(index + " " + (index - i));
                prob = helper(arr, index - i, k, dp) + Math.abs(arr[index] - arr[index - i]);
            
            mmSteps = Math.min(mmSteps, prob);
            // System.out.println("mmsteps: " + index + " " +mmSteps);
                
            }
        }
        
        return dp[index] =  mmSteps;
    }
}
