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
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> output;
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
         output = new ArrayList<Integer>();
         if(arr== null || arr.size() == 0){
             return output;
         }
         helper(arr, new ArrayList<>(), 0);
         return output;

    }
    private void helper(ArrayList<Integer> arr, ArrayList<Integer> temp, int index ){
        
        if(index == arr.size()){
            // System.out.println(temp.toString());
            output.add(summer(temp));
            return;
        }
        // System.out.println(temp.toString());
        temp.add(arr.get(index));
        helper(arr, temp, index + 1);
        
        temp.remove(temp.size() - 1);
        helper(arr, temp, index + 1);
    }
    
    private int summer(ArrayList<Integer>temp ){
        
        int sum = 0;
        for(int i = 0; i < temp.size(); i++){
            sum += temp.get(i);
        }
        return sum;
    }
}