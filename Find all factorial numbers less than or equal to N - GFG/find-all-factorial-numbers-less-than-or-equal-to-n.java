//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        long ans = 1;
        ArrayList<Long> temp = new ArrayList<>();
        for(long i = 1 ; i <= N; i++){
            // System.out.println(temp.toString());
            ans = ans* i;
            if(ans <= N){
                temp.add(ans);
            }
            if(ans > N){
                
                return temp;
            }
        }
        return temp;
    }
}