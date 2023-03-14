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
// Memoization space ->  0(N*4) + 0(N)  T-> 0(N * 3)

// class Solution{
//     public int maximumPoints(int points[][],int N){
//         //code here
//         int dp[][] = new int[N][4];
//         for (int[] row: dp)
//             Arrays.fill(row, -1);
        
        
//         return helper(points, N -1, 3, dp);
//     }
    
//     private int helper(int points[][], int index,int last, int[][] dp){
//         if(index == 0){
//             int maxi = 0;
            
//             for(int i = 0; i < 3; i++){
                
//                 if( i != last){
//                     maxi = Math.max(maxi, points[0][i]);
//                 }
//             }
//           return maxi; 
            
//         }
//         if (dp[index][last] != -1) return dp[index][last];

        
//         // for day 1 ...N
//         int maxi = 0;
        
//         for(int task =0; task < 3; task++){
//             if(task != last){
//                 int currPoints = points[index][task] + helper(points, index -1, task, dp);
//                 maxi = Math.max(maxi, currPoints);
//             }
            
//         }
//         return dp[index][last] = maxi;
//     }
// }

// Tabulation space ->  0(N*4) T-> 0(N *4*3)
class Solution{
    public int maximumPoints(int points[][],int N){
        //code here
        int dp[][] = new int[N][4];
            
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
            
        for(int day = 1; day < N; day++){
            
            for(int last = 0; last < 4; last++){
                dp[day][last] = 0;
                
                for(int task = 0; task < 3;task++){
                    
                    if(task != last){
                        int currPoints = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], currPoints);
                    }
                }
            }
        }
                return dp[N - 1][3];
    }
}