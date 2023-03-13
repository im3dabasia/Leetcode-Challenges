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
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
        //code here
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return helper(arr, N- 1, dp);
        
    }
    
    private int helper(int[] arr, int index, int[] dp){
        if(index == 0) return 0;
        
        if(dp[index] != -1) return dp[index];
        
        int left = helper(arr, index - 1, dp) + Math.abs(arr[index] - arr[index - 1]);
        int right = Integer.MAX_VALUE;
        
        if(index > 1){
            right = helper(arr,index - 2, dp) + Math.abs(arr[index] - arr[index - 2]);
        }
        
        return dp[index] = Math.min(left, right);
    }
}