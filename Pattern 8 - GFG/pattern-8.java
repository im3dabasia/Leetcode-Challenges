//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        
        for(int i = n - 1; i >= 0; i--){
            
            // to print the blank spaces before the stars
            for(int j = 0; j < (n - i - 1); j++){
                
                System.out.print(" ");
            }
            
            // TO print the stars
            for(int k = 0; k < (i * 2 + 1); k++){
                
                System.out.print("*");
            }
            
            // to print the blank space after the stars
            for(int l = 0; l < (n - i - 1); l++){
                
                System.out.print(" ");
            }
        System.out.println("");
        }
    }
}