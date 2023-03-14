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
            int [][]points=new int[N][3];
            for(int i=0;i<N;i++){
                for(int j=0;j<3;j++){
                    points[i][j]=sc.nextInt();
                }
            }
            Solution obj=new Solution();
            int res=obj.maximumPoints(points,N);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int maximumPoints(int points[][],int N){
        //code here
        int dp[][] = new int[N][4];
        for (int[] row: dp)
            Arrays.fill(row, -1);
        
        
        return helper(points, N -1, 3, dp);
    }
    
    private int helper(int points[][], int index,int last, int[][] dp){
        if(index == 0){
            int maxi = 0;
            
            for(int i = 0; i < 3; i++){
                
                if( i != last){
                    maxi = Math.max(maxi, points[0][i]);
                }
            }
           return maxi; 
            
        }
        if (dp[index][last] != -1) return dp[index][last];

        
        // for day 1 ...N
        int maxi = 0;
        
        for(int task =0; task < 3; task++){
            if(task != last){
                int currPoints = points[index][task] + helper(points, index -1, task, dp);
                maxi = Math.max(maxi, currPoints);
            }
            
        }
        return dp[index][last] = maxi;
    }
}