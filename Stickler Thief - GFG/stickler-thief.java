//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        
        // if(n ==3) return Math.max(Math.max(arr[0], arr[1]) , arr[2]);
        int[] tempArr1 = new int[n - 1];
        int[] tempArr2 = new int[n - 1];
        
        
        // idea is the thrief will never rob the first and the last house right, 
        //so run our dp5 problem from 0 to n-1 and from 1 to n return best case out of this 2
        
        // from 0 to N-1 ideally we remove the last element treat it as it was not there
        for(int i =0; i < n- 1; i++){
            tempArr1[i] = arr[i];
        }
        
        // from 1 to N-1 ideally we remove the first element treat it as it was not there
        for(int i =1; i < n ; i++){
            tempArr2[i -1] = arr[i];
        }
        
        int[] dp = new int[n ];
        Arrays.fill(dp, 0);
        
        int[] dp1 = new int[n ];
        Arrays.fill(dp1, 0);
        
        // return Math.max(helper(tempArr1, n - 2, dp), helper(tempArr2, n-2, dp1));
        return helper(arr, n- 1, dp);
    }
    
    
    private int helper(int[] arr, int index, int[] dp){
        
        if(index == 0) return arr[0];
        if(index <= -1) return 0;
        
        if(dp[index]!= 0) return dp[index];
        
        
        int pick = arr[index] + helper(arr, index - 2, dp );
        int notpick = 0 + helper(arr, index -1, dp);
        
        return dp[index] =  Math.max(pick, notpick);
    }
    
    
}