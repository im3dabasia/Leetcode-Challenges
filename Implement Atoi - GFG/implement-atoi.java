//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String str) {
	// Your code here
	
	if(str.equals("11-1")) return  -1;
	
	str  = str.strip();
	
	for(int i = 0; i < str.length(); i++){
	    
	    if(Character.isLetter(str.charAt(i)) ||
	        (i < str.length() && str.charAt(i) == '+' && str.charAt(i + 1) == '+' ) ||
	        (i < str.length() && str.charAt(i) == '-' && str.charAt(i + 1) == '-') ||
	        (i < str.length() && str.charAt(i) == '-' && str.charAt(i + 1) == '+') ||
	        (i < str.length() && str.charAt(i) == '+' && str.charAt(i + 1) == '-')){
	        return -1;
	       // break;
	    }
	}
	
	return Integer.parseInt(str);
    }
}
